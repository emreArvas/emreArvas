import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giriş=new Scanner(System.in);

        int i;
        int sonuç=1;

        System.out.println("lütfen bir sayı giriniz");
        i=giriş.nextInt();

        if(i<0){
            System.out.println("hatalı sayı girdiniz");
        } else if (i==0) {
            System.out.println("sonuç = 1");
        }else {
            for ( int l=1; l<i+1; l++){
                sonuç=sonuç*l;
            }System.out.println(sonuç);
        }
    }
}

