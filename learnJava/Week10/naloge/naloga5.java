public class naloga5 {
    public static void main (String[] args) {
        boolean comma = false;
        for (int i = 65; i <= 90; i++) {
            char character = (char) i;
            if (comma == true) {
                System.out.print(", ");
            }
            System.out.print(character);
            comma = true;
        }
    }
}