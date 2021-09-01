import java.util.Scanner;

public class naloga5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean comma = false;

        for (int i = m; i <= n; i++) {
            if (comma == true) {
                System.out.print(", ");
            }
            System.out.print(i * i);
            comma = true;
        }
    }
}