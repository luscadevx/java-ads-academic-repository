package aulasjava;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        double nota;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota do aluno (0 a 10): ");
        nota = scanner.nextDouble();
            
        if (nota >= 7.0) {
            System.out.println("Situação: APROVADO!");
        }
        else if (nota >= 5.0) {
            System.out.println("Situação: Em RECUPERAÇÃO.");
        }
        else {
            System.out.println("Situação: REPROVADO.");
        }
        
        scanner.close();
    }
}