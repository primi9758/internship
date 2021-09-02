import java.util.Scanner;

public class vaja1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean space = false;

        for (int i = 1; i <= 2 * n + 1; i++) {
            if (i == n + 1) {
                for (int j = 1; j <= 2 * n + 1; j++) {
                    if (space == true) {
                        System.out.print(" ");
                    }
                    System.out.print("+");
                    space = true;
                }
            } else {
                for (int k = 1; k <= 2 * n + 1; k++) {
                    if (k == n + 1){
                        System.out.print("+");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            
            System.out.println();
            space = false;
        }
    }
}