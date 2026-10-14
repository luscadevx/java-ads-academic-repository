package aulasjava;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        double ladoA, ladoB, ladoC;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro lado: ");
        ladoA = scanner.nextDouble();
        
        System.out.println("Digite o valor do segundo lado: ");
        ladoB = scanner.nextDouble();
        
        System.out.println("Digite o valor do terceiro lado: ");
        ladoC = scanner.nextDouble();
            
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo Equilátero (todos os lados iguais).");
            }
            else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Triângulo Isósceles (dois lados iguais).");
            }
            else {
                System.out.println("Triângulo Escaleno (todos os lados diferentes).");
            }
        }
        else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
        
        scanner.close();
    }
}