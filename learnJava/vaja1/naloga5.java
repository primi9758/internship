import java.util.*;
public class naloga5 {
    public static void main(String[] args){
        System.out.println("Enter two numbers.");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        float x = sc1.nextInt();
        float y = sc2.nextInt();

        float a = x * y;
        float b = x/ y;
        float c = x + y;
        float d = x - y;
        float e = x % y;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
}
}