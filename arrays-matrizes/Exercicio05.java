package aulasjava;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[6];
        int qtdPares = 0;
        
        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.print("\nNúmeros pares encontrados: ");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                qtdPares++;
            }
        }
        
        System.out.println("\nTotal de números pares: " + qtdPares);
        
        scanner.close();
    }
}