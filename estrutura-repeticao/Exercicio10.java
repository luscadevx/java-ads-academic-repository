package aulasjava;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        int numero, maior = 0, menor = 0, i;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 5 números inteiros:");
        
        for (i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            numero = scanner.nextInt();
            
            if (i == 1) {
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        
        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Menor valor digitado: " + menor);
        
        scanner.close();
    }
}