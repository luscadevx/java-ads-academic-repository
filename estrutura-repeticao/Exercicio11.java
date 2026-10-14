package aulasjava;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        
        int opcao;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Ver Mensagem de Boas-Vindas");
            System.out.println("2 - Mostrar Data Atual (Simulada)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Olá! Seja muito bem-vindo aos estudos de Java.");
                    break;
                case 2:
                    System.out.println("Data do sistema: 14/10/2026");
                    break;
                case 3:
                    System.out.println("A encerrar o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        
        scanner.close();
    }
}