import java.util.*;
public class naloga1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        short littleNumber = sc.nextShort();
        long bigNumber = sc.nextLong();
        float preciseNumber = sc.nextFloat();
        double veryPreciseNumber = sc.nextDouble();
        char character = sc.next().charAt(0);
        boolean choice = sc.nextBoolean();
        byte data = sc.nextByte();
        String sentence = sc.nextLine();

        System.out.println(number);
        System.out.println(littleNumber);
        System.out.println(bigNumber);
        System.out.println(preciseNumber);
        System.out.println(veryPreciseNumber);
        System.out.println(character);
        System.out.println(choice);
        System.out.println(data);
        System.out.println(sentence);

    }
}