# Sistema de Gerenciamento de Atendimento ao Cliente

## 📋 Descrição

Este projeto simula um sistema de gerenciamento de atendimento ao cliente, utilizando **estruturas de dados** básicas implementadas manualmente em **Java**:

- **Pilha** (lista encadeada) para armazenar o **histórico de solicitações**.
- **Fila** (lista encadeada) para gerenciar a **ordem de atendimento de clientes**.

### Regras Atendidas:
- Não utiliza `ArrayList`, `LinkedList` ou outras estruturas prontas.
- Utiliza apenas `String`, `int`, `float`, `try-catch`, `throws` e operações básicas de input.
- `length` é utilizado somente para manipulação de `String`.

---

## 🏠 Estrutura do Projeto

- **Elemento.java**: Representa uma solicitação ou cliente.
- **Node.java**: Estrutura do nó da lista encadeada.
- **Pilha.java**: Implementação da pilha (histórico de serviços).
- **Fila.java**: Implementação da fila (ordem de atendimento).
- **Main.java**: Classe principal para a execução do sistema.

---

## 🔧 Funcionalidades

### Pilha (Histórico de Solicitações)
- `adicionaElemento(Elemento elemento)`: Adiciona uma nova solicitação.
- `removeElemento()`: Remove a última solicitação.
- `isEmpty()`: Verifica se o histórico está vazio.
- `mostrarHistorico()`: Mostra todas as solicitações.

### Fila (Ordem de Atendimento)
- `enfileirar(Elemento elemento)`: Adiciona um novo cliente à fila.
- `desenfileirar()`: Atende o próximo cliente.
- `isEmpty()`: Verifica se a fila está vazia.
- `mostrarFila()`: Mostra todos os clientes aguardando atendimento.

---

## 💪 Tecnologias Utilizadas

- Java (linguagem pura)
- Conceitos de lista encadeada manual
- Entrada de dados via `Scanner`

---

## 🎬 Link para o Vídeo Explicativo

[Assista ao vídeo no YouTube]()

---

> Projeto desenvolvido para a disciplina de Estrutura de Dados - PUCPR - Rogério Vinicius Grzybowski Ferreira.

