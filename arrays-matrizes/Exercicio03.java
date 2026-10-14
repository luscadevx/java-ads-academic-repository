package aulasjava;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int maior, menor;
        
        System.out.println("Digite 5 valores inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        maior = numeros[0];
        menor = numeros[0];
        
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        
        scanner.close();
    }
}