package br.com.caelum.ingresso.desconto;

import java.math.BigDecimal;

public class DescontoParaEstudante  implements Desconto{

	@Override
	public BigDecimal aplicaescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.divide(new BigDecimal("2.0"));
	}

	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Desconto para Estuantes";
	}

}
