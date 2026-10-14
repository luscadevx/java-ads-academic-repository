package aulasjava;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        int senhaCorreta = 1234;
        int senhaDigitada;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Digite a senha de 4 dígitos: ");
            senhaDigitada = scanner.nextInt();
            
            if (senhaDigitada != senhaCorreta) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        } while (senhaDigitada != senhaCorreta);
        
        System.out.println("Acesso concedido!");
        
        scanner.close();
    }
}