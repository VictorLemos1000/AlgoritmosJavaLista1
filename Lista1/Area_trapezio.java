import java.util.Scanner;

public class Area_trapezio {
    
    public static void main(String[] args) {
        
        int BaseMaior;
        int BaseMenor;
        float Altura;
        float Area;

        Scanner Trapezio = new Scanner(System.in);
        BaseMaior = Trapezio.nextInt();
        BaseMenor = Trapezio.nextInt();
        Altura = Trapezio.nextFloat();

        Area = (BaseMaior + BaseMenor) * Altura / 2;
        System.out.println(Area);
    }
}
