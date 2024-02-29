package br.com.alura.imposto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    BigDecimal calcularImposto(Orcamento orcamento);
}
