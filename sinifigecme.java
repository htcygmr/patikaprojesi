import java.util.Scanner;
public class sinifigecme {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;
        Scanner input=new Scanner(System.in);

        System.out.print("matematik notunuz: ");
        mat=input.nextInt();

        System.out.print("fizik notunuz: ");
        fizik=input.nextInt();

        System.out.print("türkçe notunuz: ");
        turkce=input.nextInt();

        System.out.print("kimya notunuz: ");
        kimya=input.nextInt();

        System.out.print("müzik notunuz: ");
        muzik=input.nextInt();

        double avarage=(mat+fizik+turkce+kimya+muzik)/5;

        if (avarage<=55){
            System.out.println("sınıfta kaldınız.seneye tekrar görüşmek üzere ");
            System.out.println("ortalamanız: "+avarage);
        }else {
            System.out.println("tebrikler sınıfı geçtiniz...");
            System.out.println("ortalamanız: "+avarage);
        }
    }
}
