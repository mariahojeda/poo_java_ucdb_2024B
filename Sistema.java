import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sistema {
    // Scanner para entrada de dados do usuário
    private static Scanner input = new Scanner(System.in);

    // Instâncias das classes Menu e Comanda
    private static Menu menu = new Menu();
    private static Comanda comanda = new Comanda();

    // Contador para identificar cada venda
    private static int contadorVendas = 1;

    public static void main(String[] args) {
        // Carrega o menu a partir do arquivo
        menu.carregarMenu();

        while (true) {
            // Exibe opções para o usuário
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Iniciar comanda");
            System.out.println("2. Sair");
            int opcao = input.nextInt();

            // Executa a opção escolhida
            if (opcao == 1) {
                iniciarComanda(); // Inicia uma nova comanda
            } else if (opcao == 2) {
                System.out.println("Saindo...");
                break; // Encerra o loop e sai do programa
            } else {
                System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }

    // Método para iniciar uma nova comanda
    private static void iniciarComanda() {
        // Exibe o menu de produtos disponíveis
        menu.exibirMenu();

        while (true) {
            // Solicita o código do produto ao usuário
            System.out.println("Digite o codigo do produto para adicionar a comanda ou 0 para finalizar:");
            int codigo = input.nextInt();

            // Se o código for 0, finaliza a comanda
            if (codigo == 0) {
                finalizarComanda();
                break;
            }

            // Procura o item selecionado no menu
            Menu itemSelecionado = menu.itensMenu.stream()
                .filter(item -> item.getId() == codigo)
                .findFirst()
                .orElse(null);

            // Se o item for encontrado, adiciona à comanda
            if (itemSelecionado != null) {
                comanda.adicionarItem(itemSelecionado);
            } else {
                System.out.println("Produto não encontrado. Tente novamente.");
            }
        }
    }

    // Método para finalizar a comanda
    private static void finalizarComanda() {
        // Exibe os itens da comanda e o total
        comanda.exibirComanda();
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = input.next();

        // Registra a venda no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("vendas.txt", true))) {
            writer.write(String.format("%02d | %s | %.1f%n", contadorVendas, nomeCliente, comanda.getTotal()));
            System.out.println("Venda registrada com sucesso!");
            contadorVendas++; // Incrementa o contador para a próxima venda
        } catch (IOException e) {
            System.out.println("Erro ao registrar a venda: " + e.getMessage());
        }

        // Reinicia a comanda para o próximo pedido
        comanda = new Comanda();
    }
}
