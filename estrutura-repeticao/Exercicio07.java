package aulasjava;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        double nota, soma = 0, media;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as notas dos alunos (Digite -1 para encerrar):");
        
        System.out.print("Digite a nota 1: ");
        nota = scanner.nextDouble();
        
        while (nota != -1) {
            soma += nota;
            contador++;
            System.out.print("Digite a nota " + (contador + 1) + " (-1 para sair): ");
            nota = scanner.nextDouble();
        }
        
        if (contador > 0) {
            media = soma / contador;
            System.out.println("A média da turma é: " + media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }
        
        scanner.close();
    }
}