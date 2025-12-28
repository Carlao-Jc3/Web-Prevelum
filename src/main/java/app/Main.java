package app;

import models.Cliente;
import models.Produto;
import models.ItemVenda;
import models.Venda;
import repository.ClienteRepository;
import repository.ProdutoRepository;
import repository.VendaRepository;
import service.ClienteService;
import com.mycompany.prevelumweb.service.ProdutoService;
import service.VendaService;
import util.GeradorID;

public class Main {

    public static void main(String[] args) {

        // Repositórios
        ClienteRepository clienteRepo = new ClienteRepository();
        ProdutoRepository produtoRepo = new ProdutoRepository();
        VendaRepository vendaRepo = new VendaRepository();

        // Services
        ClienteService clienteService = new ClienteService();
        ProdutoService produtoService = new ProdutoService();
        VendaService vendaService = new VendaService();

        // Criando cliente
        Cliente cliente = new Cliente(
                GeradorID.gerar(),
                "João da Silva",
                "12345678901",
                "99999-9999"
        );
        clienteService.validarCliente(cliente);
        clienteRepo.salvar(cliente);

        // Criando produto
        Produto produto = new Produto(
                GeradorID.gerar(),
                "Dipirona",
                12.50,
                20
        );
        produtoService.validarProduto(produto);
        produtoRepo.salvar(produto);

        // Criando venda
        Venda venda = new Venda(
                GeradorID.gerar(),
                cliente
        );

        ItemVenda item = new ItemVenda(produto, 2);
        venda.adicionarItem(item);

        vendaService.validarVenda(venda);
        vendaRepo.salvar(venda);

        // Exibindo resultados
        System.out.println("Cliente cadastrado: " + cliente);
        System.out.println("Produto cadastrado: " + produto);
        System.out.println("Total da venda: R$ " + vendaService.calcularTotal(venda));
    }
}
