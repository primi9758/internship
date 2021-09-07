import java.util.Scanner;

public class naloga4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        int left = 0; 
        int straight = 0;
        int right = 0;
        boolean nobody = true;


        for (int i = 0; i <= n &&  i < 100; i++) {
            if(i > 1){
                left = straight;
            }
            if (i > 0){
                straight = right;
            }
            if (i < n){
                right = sc.nextInt();
            }

            if (i > 0) {
                if (i == 1) {
                    if (straight <= right) {
                        System.out.println(i - 1);
                        nobody = false;
                    }
                }
                if (i > 1 && i < n){
                    if (left <= straight && straight <= right) {
                        System.out.println(i - 1);
                        nobody = false;
                    }
                }
                if (i == n) {
                    if (left <= straight) {
                        System.out.println(i - 1);
                        nobody = false;
                    }
                }
            }
        }

            if (nobody == true) {
                System.out.println("NOBODY");
            }

    }
}