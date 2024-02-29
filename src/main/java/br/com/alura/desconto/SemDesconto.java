package br.com.alura.desconto;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoCom5ouMas extends  Desconto{
    public DescontoCom5ouMas(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
