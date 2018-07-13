package br.com.caelum.ingresso.desconto;

import java.math.BigDecimal;

public class DescontoParaBancos implements Desconto {

	@Override
	public BigDecimal aplicaescontoSobre(BigDecimal precoOriginal) {
		return  precoOriginal.subtract(trintaPorcentoSobre(precoOriginal));
	}
	
	private BigDecimal trintaPorcentoSobre(BigDecimal precoOriginal){
		return precoOriginal.multiply(new BigDecimal("0.3"));
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Desconto para Bancos";
	}

}
