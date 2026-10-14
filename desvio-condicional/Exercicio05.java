package aulasjava;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        int idade;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a idade do nadador: ");
        idade = scanner.nextInt();
            
        if (idade >= 5 && idade <= 10) {
            System.out.println("Categoria: Infantil");
        }
        else if (idade >= 11 && idade <= 17) {
            System.out.println("Categoria: Juvenil");
        }
        else if (idade >= 18) {
            System.out.println("Categoria: Adulto");
        }
        else {
            System.out.println("Idade abaixo do mínimo permitido (5 anos).");
        }
        
        scanner.close();
    }
}