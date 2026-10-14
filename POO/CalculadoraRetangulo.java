package aulasjava;

import java.util.Scanner;

class Retangulo {
    double largura;
    double altura;
    
    // Método para calcular a área
    double calcularArea() {
        return largura * altura;
    }
}

public class CalculadoraRetangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        
        System.out.println("--- POO: Métodos e Comportamentos ---");
        System.out.print("Digite a largura do retângulo: ");
        ret.largura = scanner.nextDouble();
        
        System.out.print("Digite a altura do retângulo: ");
        ret.altura = scanner.nextDouble();
        
        double areaFinal = ret.calcularArea();
        
        System.out.println("\nA área calculada pelo objeto é: " + areaFinal);
        
        scanner.close();
    }
}