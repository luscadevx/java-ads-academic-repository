package aulasjava;

import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args) {
        
        double salario, prestacao, limite;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do salário: ");
        salario = scanner.nextDouble();
        
        System.out.println("Digite o valor da prestação pretendida: ");
        prestacao = scanner.nextDouble();
        
        limite = salario * 0.30;
            
        if (prestacao <= limite) {
            System.out.println("Empréstimo APROVADO!");
        }
        else {
            System.out.println("Empréstimo NEGADO. A prestação ultrapassa 30% do salário.");
        }
        
        scanner.close();
    }
}