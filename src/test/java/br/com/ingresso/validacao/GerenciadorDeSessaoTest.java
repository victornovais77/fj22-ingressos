package br.com.ingresso.validacao;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
import br.com.caelum.ingresso.validacao.GerenciadorDeSessao;

public class GerenciadorDeSessaoTest {
	
	private Filme rogueOne;
	private Sala sala3D;
	private Sessao sessaoDasDez;
	private Sessao sessaoDasTreze;
	private Sessao sessaoDasDezoito;
	
	@Before
	public void preparaSessoes() {
		 this.rogueOne = new Filme ("Rogue One", Duration.ofMinutes(120),"SCI-FI", BigDecimal.TEN);
		 this.sala3D = new Sala("Sala 3D",BigDecimal.TEN);
		 
		 this.sessaoDasDez = new Sessao(LocalTime.parse("10:00:00"),rogueOne,sala3D);
		 this.sessaoDasTreze = new Sessao(LocalTime.parse("13:00:00"),rogueOne,sala3D);
		 this.sessaoDasDezoito = new Sessao(LocalTime.parse("18:00:00"),rogueOne,sala3D);
	}
	
	@Test
	public void garante_Que_Nao_Deve_Permitir_Sessao_No_Mesmo_Horario() {
		List<Sessao> sessoes = Arrays.asList(sessaoDasDez);
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoes);
		Assert.assertFalse(gerenciador.cabe(sessaoDasDez));
	}

}
