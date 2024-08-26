import java.util.ArrayList;
import java.util.Scanner; 

public class Comanda {
    // Scanner para entrada de dados do usuário
    private static Scanner input = new Scanner(System.in); // Adiciona a criação de um objeto Scanner

    // Lista que armazena os itens da comanda
    private ArrayList<Menu> itensComanda = new ArrayList<>();

    // Valor total da comanda
    private double total = 0;

    // Método para adicionar um item à comanda
    public void adicionarItem(Menu item) {
        // Adiciona o item à lista de itens da comanda
        itensComanda.add(item);
        // Atualiza o total da comanda com o preço do item adicionado
        total += item.getPreco();
    }

    // Método para exibir todos os itens da comanda e o total
    public void exibirComanda() {
        System.out.println("Itens da comanda:");
        // Itera sobre cada item na lista de itens da comanda e imprime suas informações
        for (Menu item : itensComanda) {
            System.out.println(item);
        }
        // Exibe o valor total da comanda
        System.out.println("Total: R$" + total);
    }

    // Getter para obter o valor total da comanda
    public double getTotal() {
        return total;
    }
}
