import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi1, sayi2, secenek;
        System.out.print("LUTFEN BİRİNCİ SAYİYİ GİRİNİZ = ");
        sayi1 = giris.nextInt();
        System.out.print("LUTFEN İKİNCİ SAYİYİ GİRİNİZ = ");
        sayi2 = giris.nextInt();
        System.out.println("LUTFEN İSTEDİĞİNİZ İSLEMİ SECİNİZ");
        System.out.println("1-TOPLAMA,2-ÇIKARMA,3-ÇARPMA,4-BÖLME");
        secenek = giris.nextInt();
        if (secenek == 1) {
            System.out.println("SONUC= " + (sayi1 + sayi2));
        } else if (secenek == 2) {
            System.out.println("SONUC= " + (sayi1 - sayi2));
        } else if (secenek == 3) {
            System.out.println("SONUC=  " + (sayi1 * sayi2));
        } else {
            if (sayi2 == 0) {
                System.out.println("BELİRSİZ");
            } else {
                System.out.println("SONUC=  " + (sayi1 / sayi2));
            }
        }
    }

}
