import java.util.Scanner;
public class Kwadrat {
    Scanner scan= new Scanner(System.in);
    Kwadrat(){

        double bok;
        System.out.println("dlugosc bokow ");
        bok=scan.nextDouble();

        if (bok>0) {
            double pole = bok * bok;
            System.out.println("pole:" + pole);
        }else {System.out.println("zle wymiary");}
    }
}
