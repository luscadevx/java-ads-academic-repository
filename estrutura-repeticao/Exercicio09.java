package aulasjava;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        int limite, i;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o limite máximo para buscar números ímpares: ");
        limite = scanner.nextInt();
        
        System.out.println("--- Números Ímpares até " + limite + " ---");
        
        for (i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                System.out.println("Ímpar: " + i);
            }
        }
        
        scanner.close();
    }
}