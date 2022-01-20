
import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy, kilo, indeks;
        Scanner inp = new Scanner (System.in);

        System.out.print("Boyunuzu Metre Cinsinden Giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Vücut Ağırlığınızı KG Cinsinden Giriniz : ");
        kilo = inp.nextDouble();

        indeks = ((kilo)/(boy*boy));
        System.out.println("Vücut Kitle İndeksi : " + indeks);
    }
}
