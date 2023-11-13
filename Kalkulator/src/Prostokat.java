import java.util.Scanner;
public class Prostokat {
    Scanner scan= new Scanner(System.in);
    Prostokat(){

        double bok,bok2;
        System.out.println("pierwszy bok: ");
        bok=scan.nextDouble();
        System.out.println("drugi pok: ");
        bok2=scan.nextDouble();

        if (bok>0 && bok2>0) {
            System.out.println("pole: " + (bok * bok2));
        }else {System.out.println("Złe wymiary");}
    }
}
