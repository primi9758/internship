import java.util.Scanner;

public class naloga1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int den = 0;
        boolean comma = false;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                if (comma == true) {
                    System.out.print(", ");
                }
                System.out.print(i);
                den++;
                comma = true;
            }
        }
    System.out.println("");
    System.out.println(den + " denominators");
    }
}