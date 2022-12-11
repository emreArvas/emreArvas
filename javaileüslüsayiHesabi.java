import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int taban, üs;
        int i = 1, carpim = 1;
        System.out.print("lutfen taban degerini giriniz");
        taban = giris.nextInt();

        System.out.print("lutfen üs degerini giriniz");
        üs = giris.nextInt();

        while (i < üs + 1) {
            carpim = carpim * taban;
            i++;
        }
        System.out.println("sonuç= " + carpim);
    }

}
