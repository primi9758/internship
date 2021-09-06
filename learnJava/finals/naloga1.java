import java.util.Scanner;

public class naloga1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int hz = sc.nextInt();
		int mz = sc.nextInt();
		int hk = sc.nextInt();
		int mk = sc.nextInt();
		int d = sc.nextInt();
        int hour = hz;
        int minute = mz;
        boolean breakOut = false;

        System.out.printf("%02d:%02d to %02d:%02d with an interval of %d minutes.", hz, mz, hk, mk, d);
        System.out.println();


        while (hour <= hk) {
            if (hour == hk) {
                if (minute <= mk) {
                    if (hour > 23) {
                        hour -= 24;
                    }

                    System.out.printf("%02d:%02d", hour, minute);
                    System.out.println();

                    minute += d;
                    hour += minute / 60;
                    minute %= 60;
                    breakOut = false;
                }
            } else {
                if (hour > 23) {
                    hour -= 24;
                }
                System.out.printf("%02d:%02d", hour, minute);
                System.out.println();

                minute += d;
                hour += minute / 60;
                minute %= 60;
                breakOut = false;
            }

            if (breakOut == true) {
                break;
            }
            breakOut = true;
        }



    }

}