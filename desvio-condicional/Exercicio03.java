package aulasjava;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        double valor;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        valor = scanner.nextDouble();
            
        if (valor > 0) {
            System.out.println("O número é POSITIVO.");
        }
        else if (valor < 0) {
            System.out.println("O número é NEGATIVO.");
        }
        else {
            System.out.println("O número é ZERO.");
        }
        
        scanner.close();
    }
}