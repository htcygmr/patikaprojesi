import java.util.Scanner;
public class daireninalani {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14;

        Scanner inp=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r=inp.nextInt();
        System.out.print("Dairenin merkez açısını giriniz");
        a=inp.nextInt();

        double hesap=(pi*(r*r)*a)/360;


        System.out.println("İşleminizin sonucu:"+hesap);
        
    }
}
