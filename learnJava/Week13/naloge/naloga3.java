import java.util.Scanner;

public class naloga3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int Z = sc.nextInt();
        int l = sc.nextInt();
        int u = sc.nextInt();
        int D = 1;
        int K;

        while (Z > 0 && l > 0) {
            if (Z < l) {
                l = Z;
            }
            K = Z - l;
            System.out.printf("%d. dan: %d -> %d (prehodil %d)", D, Z, K, l);
            System.out.println();
            D++;
            Z -= l;
            l -= u;
        }
    }
}