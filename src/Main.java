import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Ders Notu : ");
        mat = input.nextInt();

        System.out.print("Fizik Ders Notu : ");
        fizik = input.nextInt();

        System.out.print("Kimya Ders Notu : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Ders Notu : ");
        turkce = input.nextInt();

        System.out.print("Tarih Ders Notu : ");
        tarih = input.nextInt();

        System.out.print("Muzik Ders Notu : ");
        muzik = input.nextInt();

       int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double sonuc = (double) toplam /6;

        System.out.println(sonuc >= 60 ? "Geçtiniz." : "Kaldınız!");
        System.out.println("Not Ortalamanız : " + sonuc);

    }
}