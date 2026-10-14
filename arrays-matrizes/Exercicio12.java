package aulasjava;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrizOriginal = new int[2][3];
        int[][] matrizTransposta = new int[3][2];
        
        System.out.println("Digite os valores para a matriz original (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = scanner.nextInt();
                // Construindo a transposta ao mesmo tempo
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }
        
        System.out.println("\n--- Matriz Transposta (3x2) ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizTransposta[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}