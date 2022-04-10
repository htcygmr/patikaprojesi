import java.util.Scanner;
public class manavkasaprogrami {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlıcan;
        double hesap;
        Scanner deger=new Scanner(System.in);
        System.out.print("Armut kaç kilo? ");
        armut=deger.nextInt();
        System.out.print("Elma kaç kilo? ");
        elma=deger.nextInt();
        System.out.print("Domates kaç kilo? ");
        domates=deger.nextInt();
        System.out.print("Muz kaç kilo? ");
        muz=deger.nextInt();
        System.out.print("Patlıcan kaç kilo? ");
        patlıcan=deger.nextInt();

        hesap=((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5));
        System.out.println("toplam tutar: "+hesap);

    }
}
