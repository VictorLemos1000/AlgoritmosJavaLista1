import java.util.Scanner;

public class programa {

    public static void main(String[] args) {

        byte var1 = -127;
        short var2 = 32000;
        int var3 = 2147000000;
        long var4 = 123123123123112L;
        float var5 = 3.14f;
        double var6 = 3.14;
        char var7 = 'A';

        String nome = "Victor";
        Scanner sc = new Scanner (System.in);
        System.out.println("ola mundo");

        nome = sc.next();

        System.out.println("Como se chama?: " + nome);
    }
}
 