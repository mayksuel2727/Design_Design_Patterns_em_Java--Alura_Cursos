package br.com.alura;

import br.com.alura.pedido.GeraPedido;
import br.com.alura.pedido.GeraPedidoHandler;
import br.com.alura.pedido.acao.EnviarEmailPedido;
import br.com.alura.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;

import java.util.Arrays;

public class TestePedidos {
    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
                new SalvarPedidoNoBancoDeDados(),
                new EnviarEmailPedido()
        ));
        handler.execute(geraPedido);
    }
}
