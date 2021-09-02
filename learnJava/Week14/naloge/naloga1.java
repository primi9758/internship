import java.util.Scanner;

public class naloga1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean no = true;

        for (int i = 2; i <= n; i++) {
            boolean p = jePraštevilo(i);
            if (p == true) {

                for (int j = 2; j <= i; j++) {
                    boolean r = jePraštevilo(j);
                    if (r == true) {
                        if (i + j == n) {
                            System.out.printf(" YES. The summarization is %d + %d = %d.", j, i, n);
                            no = false;
                            break;
                        }
                    }
                }
            }
        }

        if (no == true) {
            System.out.printf("NO. There is no summarization for %d.", n);
        }
    }

    public static boolean jePraštevilo (int a) {
        if (a == 2){
            return true;
        }
        for (int b = 2; b < a; b ++) {
            if (a % b == 0) {
                break;
            } else if (b == a - 1) {
                return true;
            }
        }
        return false;
    }
}