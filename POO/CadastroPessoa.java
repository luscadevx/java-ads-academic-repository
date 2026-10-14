package aulasjava;

import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;
}

public class CadastroPessoa {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Pessoa p = new Pessoa();
        
        System.out.println("--- POO: Criando Objetos ---");
        System.out.print("Digite o nome da pessoa: ");
        p.nome = scanner.nextLine();
        
        System.out.print("Digite a idade da pessoa: ");
        p.idade = scanner.nextInt();
        
        System.out.println("\nObjeto criado com sucesso!");
        System.out.println("Nome: " + p.nome + " | Idade: " + p.idade + " anos.");
        
        scanner.close();
    }
}