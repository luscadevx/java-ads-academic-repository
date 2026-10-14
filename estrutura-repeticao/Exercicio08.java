package aulasjava;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        int num, i;
        long fatorial = 1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        num = scanner.nextInt();
        
        for (i = 1; i <= num; i++) {
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + num + " é: " + fatorial);
        
        scanner.close();
    }
}