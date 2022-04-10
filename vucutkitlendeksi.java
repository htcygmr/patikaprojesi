import java.util.Scanner;
public class vucutkitlendeksi {
    public static void main(String[] args) {

        double olcu,kilo,boy;
        Scanner hesap=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu(metre cinsinden)giriniz: ");
        boy=hesap.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo=hesap.nextDouble();

        olcu=kilo/(boy*boy);

        System.out.println("Vücut kitle indeksiniz: "+olcu);

    }
}
