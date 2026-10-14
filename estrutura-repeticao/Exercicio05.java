package aulasjava;

public class Exercicio05 {
    public static void main(String[] args) {
        
        int i;
        
        System.out.println("--- Números Pares de 1 a 20 ---");
        
        for (i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            }
        }
    }
}