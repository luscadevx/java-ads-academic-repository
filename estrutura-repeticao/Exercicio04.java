package aulasjava;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        int valor;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite números para somar (Digite 0 para sair):");
        
        do {
            System.out.print("Digite um valor: ");
            valor = scanner.nextInt();
            soma += valor;
        } while (valor != 0);
        
        System.out.println("A soma total dos valores é: " + soma);
        
        scanner.close();
    }
}