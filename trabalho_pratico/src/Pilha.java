public class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    public boolean isEmpty() {
        return this.topo == null;
    }

    // Funcão para adicionar elemento na Pilha
    public void adicionaElemento(Elemento elemento) {
        Node novoNode = new Node(elemento);
        novoNode.proximo = topo;
        topo = novoNode;
    }

    // Funcao para remover elemento da Pilha (remover o topo)
    public Elemento removeElemento() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }
        Elemento removido = topo.elemento;
        topo = topo.proximo;
        return removido;
    }

    // Funcão para mostrar todas as solicitacões
    public void mostrarHistorico() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return;
        }

        Node atual = topo;
        while (atual != null) {
            System.out.println("----------------------------------------");
            System.out.println("ID: " + atual.elemento.id);
            System.out.println("Descricão: " + atual.elemento.descricao);
            System.out.println("Data e Hora: " + atual.elemento.dataHora);
            System.out.println("----------------------------------------");
            atual = atual.proximo;
        }
    }
}
