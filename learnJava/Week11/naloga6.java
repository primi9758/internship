import java.util.Scanner;

public class naloga6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = (a < b) ? a : b;
        
        int maxd = 1;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                maxd = i;
            }
        }

        System.out.print(maxd);
    }
}