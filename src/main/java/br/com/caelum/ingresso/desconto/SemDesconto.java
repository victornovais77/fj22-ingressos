package br.com.caelum.ingresso.desconto;

import java.math.BigDecimal;

public class SemDesconto implements Desconto{

	@Override
	public BigDecimal aplicaescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Sem Desconto";
	}

}
