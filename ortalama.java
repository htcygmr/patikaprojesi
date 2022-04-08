import java.util.Scanner;
public class ortalama {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp=new Scanner(System.in);

        System.out.print("matematik notunuz:");
        mat=inp.nextInt();

        System.out.print("fizik notunuz:");
        fizik=inp.nextInt();

        System.out.print("kimya notunuz:");
        kimya=inp.nextInt();

        System.out.print("türkçe notunuz:");
        turkce=inp.nextInt();

        System.out.print("tarih notunuz:");
        tarih=inp.nextInt();

        System.out.print("müzik notunuz:");
        muzik=inp.nextInt();

        int toplam= (mat+fizik+kimya+tarih+turkce+muzik);
        double sonuc= toplam/6;






        System.out.println( sonuc>60 ? "Sınıfı Geçti" : "Sınıfta kaldı");


    }
}
