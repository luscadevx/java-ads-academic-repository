package aulasjava;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        
        double peso, altura, imc;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu peso (kg): ");
        peso = scanner.nextDouble();
        
        System.out.println("Digite a sua altura (ex: 1.75): ");
        altura = scanner.nextDouble();
        
        imc = peso / (altura * altura);
        
        System.out.println("O seu IMC é: " + imc);
            
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        }
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso normal.");
        }
        else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso.");
        }
        else {
            System.out.println("Classificação: Obesidade.");
        }
        
        scanner.close();
    }
}