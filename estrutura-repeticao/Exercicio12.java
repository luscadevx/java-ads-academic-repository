package aulasjava;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        
        int num, i, divisores = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        num = scanner.nextInt();
        
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }
        
        if (divisores == 2) {
            System.out.println("O número " + num + " é PRIMO!");
        } else {
            System.out.println("O número " + num + " NÃO é primo.");
        }
        
        scanner.close();
    }
}