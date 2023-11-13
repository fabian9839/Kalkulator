import java.util.Scanner;
public class Trojkat {
    Scanner scan= new Scanner(System.in);
    Trojkat(){

        double bok,wys;
        System.out.println("Wymiary Podstawy: ");
        bok=scan.nextDouble();
        System.out.println("Wymiary wysokości: ");
        wys=scan.nextDouble();

        if (bok>0 && wys>0){
            System.out.println("Pole: " + (bok * wys / 2));
        }else {System.out.println("Zle wymiary");}
    }
}
