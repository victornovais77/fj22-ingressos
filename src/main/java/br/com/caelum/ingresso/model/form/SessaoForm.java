package br.com.caelum.ingresso.model.form;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;
import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

public class SessaoForm {

	private Integer id;
	 

	private Integer salaId;
    
 

    private String horario;
    
    private Integer filmeId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSalaId() {
		return salaId;
	}

	public void setSalaId(Integer salaId) {
		this.salaId = salaId;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Integer getFilmeId() {
		return filmeId;
	}

	public void setFilmeId(Integer filmeId) {
		this.filmeId = filmeId;
	}
    
    public Sessao toSessao(SalaDao salaDao,FilmeDao filmeDao) {
    	
    	Filme filme = filmeDao.findOne(filmeId);
    	Sala sala = salaDao.findOne(salaId);
    	
   
    	 
    	 DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");
    	 
    	 LocalTime localDate = LocalTime.parse(horario, formatador);
    	
    	Sessao sessao = new Sessao(localDate,filme,sala);
    	sessao.setId(id);
    	
    	return sessao;
    }
}


