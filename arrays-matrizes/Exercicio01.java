package aulasjava;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] valor = new int[5];
        
        System.out.println("Digite 5 valores inteiros para salva-los.");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valor[i] = scanner.nextInt();
        }
        
        System.out.println("\n--- Valores Armazenados ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor " + (i + 1) + " = " + valor[i]);
        }
        
        scanner.close();
    }
}