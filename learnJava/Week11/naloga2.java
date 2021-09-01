import java.util.Scanner;

public class naloga2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String day = "";
        boolean output = true;
        switch (n) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;        
            case 4:
                day = "Thursday";
                break;        
            case 5:
                day = "Friday";
                break;        
            case 6:
                day = "Saturday";
                break;        
            case 7:
                day = "Sunday";
                break;        
            default:
                System.out.print("Unvalid value. A valid value is between 1 and 7.");
                output = false;
                break;
        }
        if (output == true) {
            System.out.print("Day with the number " + n + " is " + day);
        }
    }
}