import java.util.Scanner;

public class naloga3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a < b) ? ((c > b) ? c : b) : ((c > a) ? c : a);
        System.out.print(max);
    }
}