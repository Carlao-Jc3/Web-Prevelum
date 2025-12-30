let produtos = [
    { nome: "Produto A", preco: 10.5, estoque: 20, fornecedor: "Fornecedor X" },
    { nome: "Produto B", preco: 25.0, estoque: 15, fornecedor: "Fornecedor Y" }
];

let indiceSelecionado = null;

function carregarTabela(lista) {
    const tabela = document.getElementById("tabelaProdutos");
    tabela.innerHTML = "";

    lista.forEach((produto, index) => {
        const linha = document.createElement("tr");

        linha.innerHTML = `
            <td>${produto.nome}</td>
            <td>${produto.preco}</td>
            <td>${produto.estoque}</td>
            <td>${produto.fornecedor}</td>
        `;

        linha.onclick = () => selecionarLinha(index, linha);
        tabela.appendChild(linha);
    });
}

function selecionarLinha(index, linha) {
    document.querySelectorAll("tbody tr").forEach(tr => tr.classList.remove("selecionado"));
    linha.classList.add("selecionado");
    indiceSelecionado = index;
}

function pesquisarProduto() {
    const termo = document.getElementById("pesquisa").value.toLowerCase();
    const filtrados = produtos.filter(p => p.nome.toLowerCase().includes(termo));
    carregarTabela(filtrados);
}

function excluirProduto() {
    if (indiceSelecionado === null) {
        alert("Selecione um produto para excluir.");
        return;
    }

    produtos.splice(indiceSelecionado, 1);
    indiceSelecionado = null;
    carregarTabela(produtos);
}

function voltarCadastro() {
    window.location.href = "cadastro.html";
}

window.onload = () => carregarTabela(produtos);
