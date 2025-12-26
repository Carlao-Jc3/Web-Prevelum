package repository;

import java.util.ArrayList;
import java.util.List;
import models.Produto;

public class ProdutoRepository {

    private final List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listar() {
        return produtos;
    }

    public Produto buscarPorNome(String nome) {
        return produtos.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
