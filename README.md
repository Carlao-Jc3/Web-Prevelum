## 📌 Descrição do Projeto

Este repositório contém o Projeto Integrador 3 (PI3), cujo objetivo é refatorar e reorganizar o sistema desktop desenvolvido no PI anterior, removendo dependências da interface Java Swing e separando a lógica de negócio em classes próprias, aplicando princípios de projeto como SOLID e boas práticas de engenharia de software.

O código aqui apresentado servirá como base para a implementação web do sistema nas próximas etapas.

---

## 🎯 Objetivos do PI3

Criar um novo projeto Java com foco em arquitetura limpa.

Reaproveitar o código do PI2, mas com refatorações profundas.

Implementar separação de responsabilidades (UI vs. regras de negócio).

Aplicar princípios SOLID, especialmente:

SRP — Single Responsibility Principle

OCP — Open/Closed Principle

ISP — Interface Segregation Principle

DIP — Dependency Inversion Principle

Eliminar code smells e melhorar organização interna.

Criar classes reutilizáveis para futura aplicação web.

Incluir testes básicos no método main().

---

## 🏗️ Arquitetura e Estrutura do Projeto

O projeto segue uma estrutura limpa, com módulos separados:

src/
 ├── model/          # Classes de modelo (entidades)
 ├── service/        # Regras de negócio
 ├── repository/     # Persistência de dados (se aplicável)
 ├── controller/     # Camada intermediária (opcional)
 └── utils/          # Classes auxiliares


Essa organização facilita:

testabilidade

manutenção

evolução futura para web

entendimento por parte do professor

---

## 🔧 Tecnologias Utilizadas

Java 8+

NetBeans

POO

Princípios SOLID

Git/GitHub

---

## 🧩 Princípios SOLID Aplicados
✔ SRP — Single Responsibility

As classes foram separadas em:

Model

Service

Repository

Utils
Removendo lógica de negócio da antiga interface Swing.

✔ OCP — Open/Closed

Serviços e repositórios foram estruturados para permitir extensões sem alterações internas.

✔ LSP / ISP / DIP

Aplicados quando necessário, especialmente na separação das responsabilidades entre as camadas.

Detalhes completos das classes afetadas e justificativas estão no relatório em PDF.

---

## 🧹 Refatorações Realizadas

Foram eliminados diversos code smells, como:

métodos muito longos

duplicação de lógica

regras de negócio dentro de classes de interface

nomes pouco descritivos

acoplamento excessivo

Além disso, padrões de projeto foram aplicados quando pertinente (ex.: Repository Pattern).

A descrição detalhada está no relatório final.

---

## 🧪 Testes

O método main() foi utilizado para testar:

criação de objetos

funcionamento dos serviços

persistência (caso aplicável)

validações

Esses testes garantem que o núcleo da lógica está pronto para ser usado no futuro projeto web.

---

## 🗂️ Repositórios Relacionados

Este é o repositório oficial do PI3.

O projeto anterior (desktop – Swing) permanece no repositório:

🔗 [link_do_PI2_aqui]
(link)
