import java.util.Scanner;

public class naloga1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        piramida(1, n);

        sc.close();
    }

    // Metoda, ki izpise zaporedje n znakov znaka znak
    public static void zaporedje(char znak, int n) {
        
        // Preverimo, ce je n enak 0, zakljucimo (naredimo prelom vrstice)
        if (n == 0) {
            return;
        }

        // Izpisemo znak in presledek
        System.out.print(znak + " ");

        // Zmanjsamo nas "stevec" n in naredimo rekurivni klic (metoda poklice sama sebe)
        n--;
        zaporedje(znak, n);

        return;
    }

    // Metoda, ki nam izpise i-to (vr-to) vrstico piramide visine visina
    public static void vrstica(int vr, int visina) {

        // Izpisemo presledke 
        zaporedje(' ', visina - vr);

        // Izpisemo zvezdice
        zaporedje('*', 2 * vr - 1);

        // Izpisemo presledke
        zaporedje(' ', visina - vr);

        // Naredimo prelom vrstice
        System.out.println();

        return;
    }

    // Metoda, ki izpise vse vrstice piramide visine visina od i-te (vr-te) vrstice dalje
    public static void piramida(int vr, int visina) {

        // Preverimo, ce smo ze izpisali celotno piramido
        if (vr > visina) {
            return;
        }

        // Izpisemo vrstico
        vrstica(vr, visina);

        // Rekurzivno se pomaknemo po piramida navzdol
        vr++;
        piramida(vr, visina);

        return;
    }
}
