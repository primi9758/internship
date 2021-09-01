import java.util.Scanner;
public class naloga5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        char what = sc.next().charAt(0);
        int asciiVAlue = (int) what;
        if (asciiVAlue >= 65 && asciiVAlue <= 90 || asciiVAlue >= 97 && asciiVAlue <= 122) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}