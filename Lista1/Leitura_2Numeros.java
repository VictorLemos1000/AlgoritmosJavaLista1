import java.util.Scanner;

/**
 * Leitura_2Numeros
 */
public class Leitura_2Numeros {

    public static void main(String[] args) {
        
        int Primeiro;
        int Segundo;

        Scanner Leitura = new Scanner(System.in);
        Primeiro = Leitura.nextInt();
        Segundo = Leitura.nextInt();

        if (Primeiro > Segundo) {
            System.out.println("Primeiro numero eh maior:");        
        } else {
            System.out.println("Segundo numero eh maior:");
        }

    }
}