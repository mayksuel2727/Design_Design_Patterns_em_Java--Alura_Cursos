package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoCom5ouMas(
                new DescontoComCompra500ouMais(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
