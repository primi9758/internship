import java.util.Scanner;

public class naloga2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int ten = sc.nextInt();
        int s = sc.nextInt();
        int result = convert(ten, s);
        System.out.printf("The number %d in system with base %d has value %d.", ten, s, result);
    }

    public static int convert (int ten, int s){
        int r;
        int result = 0;
        int moveDigit = 1;

        while (ten > 0) {
            r = ten % s;
            ten /= s;
            result = moveDigit * r + result;
            moveDigit *= 10;
        }
        return result;
    }

}