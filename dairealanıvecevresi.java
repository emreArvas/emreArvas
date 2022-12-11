import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int yarıCap;
        double daireCevresi, daireAlani, pı = 3.14;
        System.out.println("lutfen yaricap degerini giriniz");
        yarıCap = giris.nextInt();
        daireCevresi = yarıCap * (pı) * 2;
        daireAlani = (pı) * yarıCap * yarıCap;
        System.out.println("dairenin çevresi= " + daireCevresi);
        System.out.println("dairenin alani = " + daireAlani);
    }

}
