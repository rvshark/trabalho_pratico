public class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    // Funcão enfileirar: inserir novo cliente no fim da fila
    public void enfileirar(Elemento elemento) {
        Node novoNode = new Node(elemento);
        if (isEmpty()) {
            frente = novoNode;
            tras = novoNode;
        }
        else {
            tras.proximo = novoNode;
            tras = novoNode;
        }
    }

    // Funcão desenfileirar: tirar o cliente do início da fila
    public Elemento desenfileirar() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return null;
        }

        Elemento removido = frente.elemento;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        return removido;

    }

    // Funcão para imprimir e mostrar todos os clientes da fila.
    public void mostrarFila() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }

        Node actual = frente;
        while (actual != null) {
            System.out.println("--------------------------------------------");
            System.out.println("ID (CLI): " + actual.elemento.numeroIdentificacao);
            System.out.println("Nome: " + actual.elemento.nomeCliente);
            System.out.println("Motivo: " + actual.elemento.motivoAtendimento);
            System.out.println("--------------------------------------------");
            actual = actual.proximo;
        }
    }
}
