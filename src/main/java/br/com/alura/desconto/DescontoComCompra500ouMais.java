package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoComCompra100ouMais {
    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return BigDecimal.ZERO;
    }
}