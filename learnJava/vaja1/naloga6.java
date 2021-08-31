import java.util.*;
public class naloga6 {
    public static void main (String[] args){
        System.out.println ("Enter two numbers.");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        float x = sc1.nextInt();
        float y = sc2.nextInt();

        float a = x/ y;
        System.out.println(a);
        
        float i = x;
        while (i > y) {
            i -= y;
        }
        System.out.println(i);
    }
}