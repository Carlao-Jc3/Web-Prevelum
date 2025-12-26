package service;

import models.ItemVenda;
import models.Venda;

public class VendaService {

    public void validarVenda(Venda venda) {
        if (venda == null) {
            throw new IllegalArgumentException("Venda não pode ser nula");
        }
        if (venda.getCliente() == null) {
            throw new IllegalArgumentException("Venda deve ter um cliente");
        }
        if (venda.getItens().isEmpty()) {
            throw new IllegalArgumentException("Venda deve ter ao menos um item");
        }
    }

    public double calcularTotal(Venda venda) {
        return venda.getItens()
                .stream()
                .mapToDouble(ItemVenda::getSubtotal)
                .sum();
    }
}
