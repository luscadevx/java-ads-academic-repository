package aulasjava;

public class Exercicio02 {
    public static void main(String[] args) {
        
        int contador = 10;
        
        System.out.println("--- Contagem Regressiva ---");
        
        while (contador >= 1) {
            System.out.println("Contagem: " + contador);
            contador--;
        }
        
        System.out.println("Fogo!");
    }
}