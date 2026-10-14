package aulasjava;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        int num, i;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para ver a tabuada: ");
        num = scanner.nextInt();
        
        System.out.println("--- Tabuada do " + num + " ---");
        
        for (i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        scanner.close();
    }
}