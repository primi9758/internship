import java.util.Scanner;

public class naloga5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int k = sc.nextInt();
        int n = sc.nextInt();
        int[] numbers = new int[n]; 
        int minDif = Integer.MAX_VALUE;
        int difference;
        int which = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
    
        for (int i = 0; i < n; i++) {
            difference = Math.abs(numbers[i] - k);
            if (difference < minDif) {
                minDif = difference;
                which = i;
            }
        }

        System.out.printf("The smallest difference is %d and it is from the element with index %d.", minDif, which);    
    }
}