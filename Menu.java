import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.Collections;
import java.util.Comparator;

public class Menu {
    // Identificador único para o item do menu
    int id;
    // Preço do item do menu
    double preco;
    // Nome do item do menu
    String nome;
    // Scanner para entrada de dados do usuário
    private static Scanner input = new Scanner(System.in); 
    // Lista estática que armazena todos os itens do menu
    public static ArrayList<Menu> itensMenu = new ArrayList<>();

    // Construtor padrão
    public Menu() {}

    // Construtor com parâmetros para inicializar um item do menu
    public Menu(int id, String nome, double preco) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    // Getter para o ID do item
    public int getId() {
        return id;
    }

    // Setter para o ID do item
    public void setId(int id) {
        this.id = id;
    }

    // Getter para o preço do item
    public double getPreco() {
        return preco;
    }

    // Setter para o preço do item
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter para o nome do item
    public String getNome() {
        return nome;
    }

    // Setter para o nome do item
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para retornar uma representação em string do item do menu
    @Override
    public String toString() {
        return "ID: " + this.getId() + " | Nome: " + this.getNome() + " | Preco: R$" + this.getPreco();
    }

    // Método para carregar os itens do menu a partir de um arquivo
    public void carregarMenu() {
        try (BufferedReader reader = new BufferedReader(new FileReader("produtos.txt"))) {
            String linha;
            // Lê cada linha do arquivo
            while ((linha = reader.readLine()) != null) {
                // Divide a linha em partes usando o caractere '|' como delimitador
                String[] partes = linha.split("\\|");
                if (partes.length == 3) {
                    // Converte as partes para os tipos apropriados
                    int id = Integer.parseInt(partes[0].trim());
                    String nome = partes[1].trim();
                    double preco = Double.parseDouble(partes[2].trim());
                    // Cria um novo item do menu e adiciona à lista
                    Menu item = new Menu(id, nome, preco);
                    itensMenu.add(item);
                }
            }
        } catch (IOException e) {
            // Exibe uma mensagem de erro caso haja uma falha na leitura do arquivo
            System.out.println("Erro ao carregar o menu: " + e.getMessage());
        }
    }

    // Método para exibir todos os itens do menu
    public void exibirMenu() {
        System.out.println("Menu disponivel:");
        for (Menu item : itensMenu) {
            System.out.println(item);
        }
    }
}
