import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz(kg): ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu giriniz(cm): ");
        boy = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vucut Kitle Indeksiniz: " + indeks);
    }
}
