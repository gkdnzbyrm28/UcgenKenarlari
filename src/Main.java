import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c,cevre,alan,u;

        Scanner input = new Scanner(System.in);

        System.out.print("A Kenarini Giriniz.");
        a=input.nextDouble();
        System.out.print("B Kenarini Giriniz");
        b=input.nextDouble();
        System.out.print("C Kenarini Giriniz");
        c=input.nextDouble();

        cevre=(a+b+c);
        u=cevre/2;
        System.out.println("Ucgenin cevresi\n"+cevre);
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin alani\n"+alan);
    }
}
