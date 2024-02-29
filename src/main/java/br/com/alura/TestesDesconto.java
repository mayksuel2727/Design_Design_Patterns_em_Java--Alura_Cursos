package br.com.alura;

import br.com.alura.desconto.CalculadoraDescontos;
import br.com.alura.imposto.CalculadoraDeImposto;
import br.com.alura.imposto.ICMS;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDesconto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"),6);
        CalculadoraDescontos calculadora = new CalculadoraDescontos();
        System.out.println(calculadora.calcular(orcamento));

        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"),1);
        System.out.println(calculadora.calcular(segundoOrcamento));
    }
}