package aulasjava;

import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        
        int opcao;
        double saldo = 1000.0; // Saldo inicial simulado
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MENU BANCO ===");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sair");
        System.out.println("Escolha uma opção: ");
        
        opcao = scanner.nextInt();
            
        switch (opcao) {
            case 1:
                System.out.println("O seu saldo atual é: R$ " + saldo);
                break;
            case 2:
                System.out.println("Depósito selecionado. Operação realizada com sucesso!");
                break;
            case 3:
                System.out.println("A sair do sistema. Até breve!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
}