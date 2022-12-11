import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * 1 yildiz
         ** 2 yildiz
         *** 3 yildiz
         **** 4 yildiz
         */
        Scanner giris = new Scanner(System.in);
        int i;
        System.out.println("LUTFEN İSTEDİĞİNİZ SUTUN SAYİSİNİ GİRİN = ");
        i = giris.nextInt();

        for (int k = 1; k < i; k++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
