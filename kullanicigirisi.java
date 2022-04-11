import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {
        String userName,password;
        Scanner inp=new Scanner(System.in);

        System.out.print("kullanıcı adınız:");
        userName=inp.nextLine();

        System.out.print("şifreniz:");
        password=inp.nextLine();

        if (userName.equals("patika")&&password.equals("java123")){
            System.out.println("giriş yaptınız!");


        }else {
            System.out.println("yanlış giriş yaptınız....");

        }
       
    }
}
