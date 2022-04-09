import java.util.Scanner;

public class uckenalanı {
    public uckenalanı() {
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.kenarı girin: ");
        int a = girdi.nextInt();
        System.out.print("2.kenarı girin: ");
        int b = girdi.nextInt();
        System.out.print("3.kenarı girin: ");
        int c = girdi.nextInt();
        double alan = (double)((a + b + c) / 2);
        System.out.println("  üçgeninizin alanı" + alan);
    }
}
