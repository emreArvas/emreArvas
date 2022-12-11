import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //fibonacci sayı dizisi
        //1 1 2 3 5 8 13
        int sayı1=1;
        int sayı2=1;
        int yeni;
        System.out.println(sayı1);
        System.out.println(sayı2);

        for(int i=1; i<12; i++){

            yeni=sayı1+sayı2;
            System.out.println(yeni);
            sayı1=sayı2;
            sayı2=yeni;
        }
    }
}
