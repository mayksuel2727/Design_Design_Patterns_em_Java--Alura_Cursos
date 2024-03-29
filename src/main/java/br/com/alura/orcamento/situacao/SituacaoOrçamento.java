package br.com.alura.orcamento.situacao;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrçamento {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento não pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento não pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento não pode ser finalizado!");
    }

}
