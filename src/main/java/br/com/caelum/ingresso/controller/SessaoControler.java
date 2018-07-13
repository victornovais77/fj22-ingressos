package br.com.caelum.ingresso.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;
import br.com.caelum.ingresso.dao.SessaoDao;
import br.com.caelum.ingresso.desconto.TipoDeIngresso;
import br.com.caelum.ingresso.model.Sessao;
import br.com.caelum.ingresso.model.form.SessaoForm;
import br.com.caelum.ingresso.rest.ImagemCapa;
import br.com.caelum.ingresso.rest.imdbClient;
import br.com.caelum.ingresso.validacao.GerenciadorDeSessao;

@Controller
public class SessaoControler {

	@Autowired
	private FilmeDao filmeDao;

	@Autowired
	private SalaDao salaDao;

	@Autowired
	private SessaoDao sessaoDao;
	
	@Autowired
	private imdbClient client;

	@GetMapping("/admin/sessao")
	public ModelAndView form(@RequestParam("salaId") int salaId, SessaoForm form) {
		ModelAndView mv = new ModelAndView("sessao/sessao");

		mv.addObject("sala", salaDao.findOne(salaId));
		mv.addObject("filmes", filmeDao.findAll());
		mv.addObject("form", form);

		return mv;
	}

	@PostMapping("/admin/sessao")
	@Transactional
	public ModelAndView salva(@Valid SessaoForm form, BindingResult result) {

		System.out.println("Horario do form: " + form.getHorario());

		if (result.hasErrors()) {

			return form(form.getSalaId(), form);
		}

		Sessao sessao = form.toSessao(salaDao, filmeDao);

		List<Sessao> sessaoDaSala = sessaoDao.buscarSessoesDaSala(sessao.getSala());

		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessaoDaSala);

		if (gerenciador.cabe(sessao)) {

			sessaoDao.save(sessao);

			return new ModelAndView("redirect:/admin/sala/" + form.getSalaId() + "/sessoes");
		}

		return form(form.getSalaId(), form);
	}

	@GetMapping("/sessao/{id}/lugares")
	public ModelAndView lugaresnaSessao(@PathVariable("id") Integer SessaoId) {

		ModelAndView mv = new ModelAndView("sessao/lugares");

		Sessao sessao = sessaoDao.findOne(SessaoId);
		
	    Optional<ImagemCapa> imagemCapa = client.request(sessao.getFilme(), ImagemCapa.class);
		
		mv.addObject("sessao", sessao);
		mv.addObject("imagemCapa",imagemCapa.orElse(new ImagemCapa()));
		mv.addObject("tiposDeIngressos",TipoDeIngresso.values());

		return mv;
	}

}
