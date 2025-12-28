package com.mycompany.prevelumweb.service;

import models.Produto;

public class ProdutoService {

    public void validarProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo");
        }
        if (produto.getNome() == null || produto.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto é obrigatório");
        }
        if (produto.getPreco() <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        if (produto.getEstoque() < 0) {
            throw new IllegalArgumentException("Estoque inválido");
        }
    }

    public void baixarEstoque(Produto produto, int quantidade) {
        if (produto.getEstoque() < quantidade) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        produto.setEstoque(produto.getEstoque() - quantidade);
    }
}
