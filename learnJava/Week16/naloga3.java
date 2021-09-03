import java.util.Scanner;

public class naloga3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();

        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == (int)(n/2 + 1)) {
                        System.out.print(1 + " ");
                    } else {
                        if (i == (int)(n/2 + 1)) {
                            System.out.print(1 + " ");                        
                        } else {
                            System.out.print(0 + " ");                        
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}