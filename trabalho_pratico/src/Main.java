import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Uso da biblioteca Scanner para leitura e entrada de dados pelo teclado/console.
        Scanner sc = new Scanner(System.in);
        Pilha historico = new Pilha();
        Fila filaAtendimento = new Fila();
        int opcao = -1;

        // Base de dados encaminhada.
        historico.adicionaElemento(new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"));
        historico.adicionaElemento(new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00"));
        historico.adicionaElemento(new Elemento("REQ003", "Atualização de sistema", "2024-08-20 11:30"));
        historico.adicionaElemento(new Elemento("REQ004", "Suporte técnico", "2024-08-20 12:00"));
        historico.adicionaElemento(new Elemento("REQ005", "Troca de equipamento", "2024-08-20 12:30"));
        historico.adicionaElemento(new Elemento("REQ006", "Consulta de garantia", "2024-08-20 13:00"));
        historico.adicionaElemento(new Elemento("REQ007", "Reparo de impressora", "2024-08-20 13:30"));
        historico.adicionaElemento(new Elemento("REQ008", "Configuração de rede", "2024-08-20 14:00"));
        historico.adicionaElemento(new Elemento("REQ009", "Restauração de dados", "2024-08-20 14:30"));
        historico.adicionaElemento(new Elemento("REQ010", "Consulta técnica", "2024-08-20 15:00"));

        // Base de dados encaminhada.
        filaAtendimento.enfileirar(new Elemento(1, "Maria Silva", "Dúvida sobre produto"));
        filaAtendimento.enfileirar(new Elemento(2, "João Souza", "Reclamação de serviço"));
        filaAtendimento.enfileirar(new Elemento(3, "Ana Costa", "Solicitação de reembolso"));
        filaAtendimento.enfileirar(new Elemento(4, "Pedro Alves", "Informações de entrega"));
        filaAtendimento.enfileirar(new Elemento(5, "Carla Dias", "Agendamento de visita"));
        filaAtendimento.enfileirar(new Elemento(6, "Lucas Martins", "Alteração de pedido"));
        filaAtendimento.enfileirar(new Elemento(7, "Patrícia Rocha", "Cancelamento de contrato"));
        filaAtendimento.enfileirar(new Elemento(8, "Rafael Lima", "Renovação de assinatura"));
        filaAtendimento.enfileirar(new Elemento(9, "Fernanda Gomes", "Suporte para instalação"));
        filaAtendimento.enfileirar(new Elemento(10, "Carlos Eduardo", "Pedido de orçamento"));


        // Simulacão de um aplicativo de atendimento em um loop, podendo navegar entre as opcões.
        while (opcao != 0) {
            System.out.println("\n--- Sistema de Atendimento ---");
            System.out.println("1 - Adicionar Solicitacão (Histórico)");
            System.out.println("2 - Remover Solicitacão (Histórico)");
            System.out.println("3 - Mostrar Histórico de Solicitacões");
            System.out.println("4 - Adicionar Cliente à Fila");
            System.out.println("5 - Atender Próximo Cliente");
            System.out.println("6 - Mostrar Fila de Clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcão: ");
            try {
                opcao = Integer.parseInt(sc.nextLine());

                // Criacão de uma solicitacão (Pilha)
                if (opcao == 1) {
                    System.out.println("ID da Solicitacão: ");
                    String id = sc.nextLine();
                    System.out.println("Descricão: ");
                    String descricao = sc.nextLine();
                    System.out.println("Data e Hora: ");
                    String dataHora = sc.nextLine();
                    historico.adicionaElemento(new Elemento(id, descricao, dataHora));
                }

                // Remocão de uma solicitacão (Pilha)
                else if (opcao == 2) {
                    Elemento removido = historico.removeElemento();
                    if (removido != null) {
                        System.out.println("Solicitacão removida: " + removido.id);
                    } else {
                        System.out.println("Não há nada para remover!");
                    }
                }

                // Mostrar o histórico (Imprimir pilha)
                else if (opcao == 3) {
                    historico.mostrarHistorico();

                }

                // Adicionar cliente a fila
                else if (opcao == 4) {
                    System.out.print("Número de Identificação: ");
                    int numero = Integer.parseInt(sc.nextLine());
                    System.out.print("Nome do Cliente: ");
                    String nome = sc.nextLine();
                    System.out.print("Motivo do Atendimento: ");
                    String motivo = sc.nextLine();
                    filaAtendimento.enfileirar(new Elemento(numero, nome, motivo));

                }

                // Remover cliente da fila
                else if (opcao == 5) {
                    Elemento atendido = filaAtendimento.desenfileirar();
                    if (atendido != null) {
                        System.out.println("Cliente atendido: " + atendido.nomeCliente);
                    }

                }

                // Mostra toda a fila de atendimento em ordem
                else if (opcao == 6) {
                    filaAtendimento.mostrarFila();

                }

                // Opcão para encerrar o programa
                else if (opcao == 0) {
                    System.out.println("Saindo do sistema...");
                }
                else {
                    System.out.println("Opção inválida!");
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida! Tente novamente.");

            }
        }

        sc.close();
    }
}

