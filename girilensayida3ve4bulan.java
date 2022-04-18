import java.util.Scanner;

public class girilensayiciftmi {

    public static void main(String[] args) {

        int sayac,ortalama,adet=0,toplam=0,sayi;
        Scanner input=new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        sayi=input.nextInt();

        for (sayac=1;sayac<=sayi;sayac++){
            if ((sayac%4==0)&&(sayac%3==0)){
                toplam+=sayac;
                adet++;
                ortalama=toplam/adet;
                System.out.println(ortalama);
            }
        }
    }
}
