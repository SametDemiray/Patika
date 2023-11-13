import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, toplam;
        double kdv = 1.18;
        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat Giriniz : ");
        tutar = input.nextInt();


        toplam = (tutar * kdv);

        double sonuc = toplam;

        System.out.println(toplam);
        System.out.println("Genel Toplam : " + sonuc);


    }
}