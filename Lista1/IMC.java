import java.util.Scanner;

/**
 * IMC
 */
public class IMC {

    public static void main(String[] args) {
        float Peso;
        float Altura;
        float Resultado;
        Scanner Carlos = new Scanner(System.in);
        Peso = Carlos.nextFloat();
        Altura = Carlos.nextFloat();

       Resultado = Peso / (Altura * Altura);
        System.out.println(Resultado);
    }
}
