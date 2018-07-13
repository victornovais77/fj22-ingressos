package br.com.caelum.ingresso.desconto;

import java.math.BigDecimal;

public class DescontoParaEstuante  implements Desconto{

	@Override
	public BigDecimal aplicaescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.divide(new BigDecimal("2.0"));
	}

}
