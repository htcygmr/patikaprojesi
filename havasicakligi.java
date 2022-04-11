import java.util.Scanner;
public class havasicakligi {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("hava sıcaklığını giriniz: ");
        heat=input.nextInt();

        if (heat<5){
            System.out.print("kayak yapabilirsiniz");
        }else if (heat<=25){
            if (heat<=15){
                System.out.println("sinemaya gidebilirsiniz");
            }if (heat>=10){
                System.out.println("pikniğe gidebilirsiniz");
            }
        }else {
            System.out.println("yüzmeye gidebilirsiniz");
        }

 
    }
}
