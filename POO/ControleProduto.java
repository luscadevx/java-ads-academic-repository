package aulasjava;

import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    
    // Construtor com parâmetros
    Produto(String nomeProduto, double precoProduto) {
        nome = nomeProduto;
        preco = precoProduto;
    }
    
    void exibirDetalhes() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }
}

public class ControleProduto {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- POO: Utilizando Construtores ---");
        System.out.print("Digite o nome do produto: ");
        String nomeInput = scanner.nextLine();
        
        System.out.print("Digite o preço do produto: ");
        double precoInput = scanner.nextDouble();
        
        // Instanciando o objeto passando dados diretamente para o construtor
        Produto prod = new Produto(nomeInput, precoInput);
        
        System.out.println("\nDados do Produto instanciado:");
        prod.exibirDetalhes();
        
        scanner.close();
    }
}