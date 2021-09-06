import java.util.Scanner;

public class naloga4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
        int lines = 0;
        int number, digit, divNum;
        int maxLines = Integer.MIN_VALUE;
        int which = 0;


        for (int i = 0; i < n; i++) {
            lines = 0;
            number = sc.nextInt();
            divNum = number;
            while (divNum > 0) {
                digit = divNum % 10;
                divNum /= 10;

                switch (digit) {
                    case 0:
                        lines += 6;
                        break;
                    case 1:
                        lines += 2;
                        break;
                    case 2:
                        lines += 5;
                        break;
                    case 3:
                        lines += 5;
                        break;
                    case 4:
                        lines += 4;
                        break;
                    case 5:
                        lines += 5;
                        break;
                    case 6:
                        lines += 6;
                        break;
                    case 7:
                        lines += 3;
                        break;
                    case 8:
                        lines += 7;
                        break;
                    case 9:
                        lines += 6;
                        break;
                }

                if (lines > maxLines) {
                    maxLines = lines;
                    which = number;
                }
            }
        }

        System.out.printf("The number %d has the most lines, which is %d.", which, maxLines);
    }
}