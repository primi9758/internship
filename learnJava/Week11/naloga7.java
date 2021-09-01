import java.util.Scanner;

public class naloga7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b;

        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}