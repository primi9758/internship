import java.util.Scanner;

public class naloga3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int c = 1;
        int v = a;
        int p = 0;

        while (c <= k) {
            p++;
            for (int i = 0; i < v; i++){
                c++;
            }
            v += b;
        }

        System.out.print(p);
    }
}