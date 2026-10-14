package aulasjava;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        int num1, num2, num3;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        num3 = scanner.nextInt();
            
        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        }
        else {
            System.out.println("O maior número é: " + num3);
        }
        
        scanner.close();
    }
}