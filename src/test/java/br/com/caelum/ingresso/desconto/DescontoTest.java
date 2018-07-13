package br.com.caelum.ingresso.desconto;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.ingresso.desconto.SemDesconto;
import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Ingresso;
import br.com.caelum.ingresso.model.Lugar;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

public class DescontoTest {
	
	@Test
	public void nao_Deve_Conceder_Desconto_Para_Ingresso_Normal(){
		
		Lugar a1 = new Lugar("A",1);
		
		Sala sala= new Sala("Eldorado Imax",new BigDecimal("20.5"));
		Filme filme = new Filme("Rogue one",Duration.ofMinutes(120),"SCI-FI",new BigDecimal("12"));
		
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"),filme,sala);
		Ingresso ingresso = new Ingresso(sessao,TipoDeIngresso.INTEIRO,a1);
		
		System.out.println("sala: " + ingresso.getSessao().getSala().getPreco());
		System.out.println("filme" + ingresso.getSessao().getFilme().getPreco());
		
		BigDecimal precoEsperado = new BigDecimal("32.5");
		
		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}

}
