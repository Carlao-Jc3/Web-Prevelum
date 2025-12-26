package repository;

import java.util.ArrayList;
import java.util.List;
import models.Venda;

public class VendaRepository {

    private final List<Venda> vendas = new ArrayList<>();

    public void salvar(Venda venda) {
        vendas.add(venda);
    }

    public List<Venda> listar() {
        return vendas;
    }
}
