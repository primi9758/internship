import java.util.Scanner;

public class naloga1 {
    public static void main (String[] args) {
        System.out.println("Enter two numbers and an arithemic operator (like + or -).");
        Scanner sc = new Scanner (System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String o = sc.next();

        boolean valid = true;
        double res = 0;
        switch (o) {
            case "+": 
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            case "%":
                res = a % b;
                break;
            default:
                System.out.print("Operator not valid.");
                valid = false;
                break;
        }
    if (valid == true) {
        System.out.print(res);
    }
    }
}