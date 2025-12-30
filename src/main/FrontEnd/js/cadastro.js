function limparCampos() {
    document.getElementById("cadastroForm").reset();
}

function cadastrarProduto() {
    const nome = document.getElementById("nome").value.trim();
    const preco = document.getElementById("preco").value;
    const estoque = document.getElementById("estoque").value;
    const fornecedor = document.getElementById("fornecedor").value.trim();

    if (nome === "" || preco === "" || estoque === "" || fornecedor === "") {
        alert("Preencha todos os campos.");
        return;
    }

    if (preco <= 0) {
        alert("Preço inválido.");
        return;
    }

    if (estoque < 0) {
        alert("Estoque inválido.");
        return;
    }

    alert("Produto cadastrado com sucesso!");

    limparCampos();
}

function irParaListagem() {
    window.location.href = "produtos.html";
}
