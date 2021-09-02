import java.util.Scanner;

public class naloga2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean comma = false;

        for (int i = a; i <= b; i ++) {
            boolean p = jePraštevilo(i);
            if (p == true) {
                if (comma == true) {
                    System.out.printf(", ");
                }
                System.out.printf("%d", i);
                comma = true;
            }
        }
    }

    public static boolean jePraštevilo (int i) {
        for (int j = 2; j < i; j ++) {
            if (i % j == 0) {
                break;
            } else if (j == i - 1) {
                return true;
            }
        }
        return false;
    }
}