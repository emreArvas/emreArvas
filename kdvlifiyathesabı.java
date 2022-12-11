import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double tutar, kdvliFiyat, kdv = 0.18;
        System.out.println("LUTFEN BİR TUTAR GİRİNİZ");
        tutar = giris.nextInt();
        kdvliFiyat = tutar + tutar * (kdv);
        System.out.println("urunun kdvli fiyatı = " + kdvliFiyat);
    }

