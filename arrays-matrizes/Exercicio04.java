package aulasjava;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[4];
        double soma = 0, media;
        int acimaMedia = 0;
        
        System.out.println("Digite as 4 notas do aluno:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        
        media = soma / 4;
        
        for (int i = 0; i < 4; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            }
        }
        
        System.out.println("\nMédia da turma: " + media);
        System.out.println("Quantidade de notas acima da média: " + acimaMedia);
        
        scanner.close();
    }
}