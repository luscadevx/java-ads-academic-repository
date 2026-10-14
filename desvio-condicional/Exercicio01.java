package aulasjava;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        int numero;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        numero = scanner.nextInt();
            
        if (numero % 2 == 0) {
            System.out.println("O número é PAR!");
        }
        else {
            System.out.println("O número é ÍMPAR!");
        }
        
        scanner.close();
    }
}