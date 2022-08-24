import java.util.Scanner;

public class Identificar_numero {
    
    public static void main(String[] args) {
        
        int Numero;

        Scanner Identificador = new Scanner(System.in);
        Numero = Identificador.nextInt();
        

        if (Numero %2 == 0) {
            System.out.println("Eh par:" + Numero);
        } else {
            System.out.println("Eh impar:" + Numero);
        }
    }
}
