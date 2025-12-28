package com.mycompany.prevelumweb.service;

import models.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProdutoServiceTest {
    
    @Test
    public void deveLancarExcecaoQuandoPrecoForNegativo() {
        ProdutoService service = new ProdutoService();

        Produto produto = new Produto();
        produto.setNome("Dipirona");
        produto.setPreco(-10.0);
        produto.setEstoque(10);

        assertThrows(IllegalArgumentException.class, () -> {
            service.validarProduto(produto);
        });
    }
    
    public ProdutoServiceTest() {
    }
}
