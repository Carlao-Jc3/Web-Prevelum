package models;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private int id;
    private Cliente cliente;
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda() {}

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public List<ItemVenda> getItens() { return itens; }

    
    public void adicionarItem(ItemVenda item) {    
        itens.add(item);     
    }

    public double getTotal() {
        return itens.stream()
                .mapToDouble(ItemVenda::getSubtotal)
                .sum();
    }
}
