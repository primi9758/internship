import java.util.*;
public class naloga4 {
    public static void main(String[] args){
        System.out.println("Enter two numbers.");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int x = sc1.nextInt();
        int y = sc2.nextInt();

        int a = x * y;
        int b = x/ y;
        int c = x + y;
        int d = x - y;
        int e = x % y;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
}
}