import java.util.Scanner;

public class naloga5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int s;
        boolean allow = true;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= 2 * i -1; j++) {
                s = 2 * n - 2 * i;
                if (allow == true) {
                    for (int k = 1; k <= s; k++) {
                        System.out.print(" ");
                        allow = false;
                    }
                }
                System.out.print("* ");
                
            }
            System.out.println("");
            allow = true;
        }
    }
}