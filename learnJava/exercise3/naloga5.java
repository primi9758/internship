import java.util.Scanner;

public class naloga5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;
        int which = 0;
        int steps;

        for (int i = a; i <= b; i++) {
            steps = calcSteps (i);
            if (steps > max) {
                max = steps;
                which = i;
            }
        }
        
        System.out.printf("The number with the biggest Collatz sequence between %d and %d is %d with %d steps.", a, b, which, max);
    }

    public static int calcSteps (int number) {
        int usedNumber = number;
        int steps = 1;
        while (usedNumber > 1) {
            if(usedNumber % 2 == 0) {
                usedNumber /= 2;
                steps++;
            } else {
                usedNumber= 3 * usedNumber + 1;
                steps++;
            }
        }

        return steps;
    }    
}