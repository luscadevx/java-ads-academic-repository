package aulasjava;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\n--- Elementos da Diagonal Principal ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Elemento [" + i + "][" + i + "] = " + matriz[i][i]);
        }
        
        scanner.close();
    }
}