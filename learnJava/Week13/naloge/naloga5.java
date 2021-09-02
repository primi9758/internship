import java.util.Scanner;

public class naloga5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int size, CD, filed;
        filed = 0;
        CD = 1;

        while (sc.hasNextInt()) {
            size = sc.nextInt();
            if (k - filed < size) {
                if (CD == n) {

                    break;
                }
                filed = 0;    
                CD++;
            }
            filed += size;
            System.out.printf("%d EP -> CD %d (%d EP)", size, CD, filed);
            System.out.println();
       }
        
        int left = n - CD;

        if (left == 1) {
        System.out.printf("There is still %d empty CD left.", left);
        } else if (left > 1) {
        System.out.printf("There are still %d empty CD's left.", left);
        }

        sc.close();
    }
}