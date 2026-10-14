package aulasjava;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[6];
        int soma = 0;
        
        System.out.println("Digite 6 valores inteiros:");
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        
        System.out.println("\nA soma de todos os elementos é: " + soma);
        
        scanner.close();
    }
}