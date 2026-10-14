package aulasjava;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        
        int ano;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um ano: ");
        ano = scanner.nextInt();
            
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano é BISSEXTO.");
        }
        else {
            System.out.println("O ano NÃO é bissexto.");
        }
        
        scanner.close();
    }
}