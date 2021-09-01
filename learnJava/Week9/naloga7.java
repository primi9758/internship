import java.util.Scanner;
 public class naloga7 {
     public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);

        System.out.println(x1);
        System.out.println(x2);
     }
 }