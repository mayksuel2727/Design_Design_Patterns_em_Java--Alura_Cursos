package br.com.alura.orcamento;

import br.com.alura.orcamento.situacao.EmAnalise;
import br.com.alura.orcamento.situacao.SituacaoOrçamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    private int quantidadeItens;

    private SituacaoOrçamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }



    public SituacaoOrçamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrçamento situacao) {
        this.situacao = situacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

}
