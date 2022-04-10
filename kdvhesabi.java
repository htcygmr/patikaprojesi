import java.util.Scanner;
public class kdvhesabi {
    public static void main(String[] args) {
        double tutar,kdvOran=0,kadvTutar,kdvliTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("ücret tutarını giriniz: ");
        tutar=input.nextDouble();



        if ((tutar>=0)&&(tutar<=1000)){
            kdvOran=0.18;

        }else if (tutar>=1000){
            kdvOran=0.8;

        }

        kadvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kadvTutar;

        System.out.println("KDV'siz tutar: "+tutar);
        System.out.println("KDV Oranı: "+kdvOran);
        System.out.println("KDV Tutarı: "+kadvTutar);
        System.out.println("KDV'li Tutar: "+kdvliTutar);

    }
}
