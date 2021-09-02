import java.util.Scanner;

public class vaja1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        operations(x, y);
    }

    public static void operations(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.print(a % b);
    }
}