package aulasjava;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int busca;
        boolean encontrado = false;
        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.print("\nDigite um número para procurar no vetor: ");
        busca = scanner.nextInt();
        
        for (int i = 0; i < 5; i++) {
            if (numeros[i] == busca) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("O número " + busca foi encontrado no vetor!");
        } else {
            System.out.println("O número " + busca + " NÃO foi encontrado.");
        }
        
        scanner.close();
    }
}