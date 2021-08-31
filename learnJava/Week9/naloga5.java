import java.util.*;
public class naloga5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        char what = sc.next().charAt(0);
        boolean b = Character.isLetter(what);
        if (b == false) {
            System.out.println("NO");
        } else if (b == true) {
            System.out.println("YES");
        }

    }
}