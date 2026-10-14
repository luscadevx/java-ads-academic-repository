package aulasjava;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[2][3];
        int maior, linhaMaior = 0, colunaMaior = 0;
        
        System.out.println("Digite os valores para a matriz (2 linhas x 3 colunas):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        maior = matriz[0][0];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        
        System.out.println("\nO maior valor é: " + maior);
        System.out.println("Localizado na linha " + linhaMaior + " e coluna " + colunaMaior);
        
        scanner.close();
    }
}