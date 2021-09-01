import java.util.Scanner;

public class naloga7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean comma = false;

        for (int i = 1; i <= 10; i++) {
            int num = n * i;
            if (comma == true) {
                System.out.print(", ");
            }
            System.out.print(num);
            comma = true;
        }
    }
}