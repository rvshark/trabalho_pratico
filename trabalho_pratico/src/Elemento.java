public class Elemento {
    String id;
    String descricao;
    String dataHora;
    String nomeCliente;
    String motivoAtendimento;
    int numeroIdentificacao;

    // Método construtor para elemento da Pilha
    public Elemento(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    // Método construtor para elemento da Fila
    public Elemento(int numeroIdentificacao, String nomeCliente, String motivoAtendimento) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.nomeCliente = nomeCliente;
        this.motivoAtendimento = motivoAtendimento;
    }
}
