package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Kamil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static void Zadanie1_4() {
        int zad1;
        do {
            System.out.println("1. Działanie >>\n2.Działanie <<\n3. Działanie >>>\n0. Koniec");
            Scanner in = new Scanner(System.in);
            zad1 = in.nextInt();
            switch (zad1) {
                case 1:
                    int x,
                     y;
                    System.out.println("Podaj x:");
                    Scanner zad = new Scanner(System.in);
                    x = zad.nextInt();
                    System.out.println("Podana zmienna to: " + x);
                    y = x >> 2;
                    System.out.println("Zmienna po przesunięciu o 2 bity w prawo to: " + y);
                    break;
                case 2:
                    int z,
                     t;
                    System.out.println("Podaj z:");
                    Scanner zadd = new Scanner(System.in);
                    z = zadd.nextInt();
                    System.out.println("Podana zmienna to: " + z);
                    t = z << 2;
                    System.out.println("Zmienna po przesunięciu o 2 bity w lewo to: " + t);
                    break;
                case 3:
                    int a,
                     b;
                    System.out.println("Podaj a: ");
                    Scanner zaddd = new Scanner(System.in);
                    a = zaddd.nextInt();
                    System.out.println("Podana zmienna to: " + a);
                    b = a >>> 2;
                    System.out.println("Zmienna po przesunięcu o 2 bity w prawo bez znaku to: " + b);
                    break;
            }
        } while (zad1 != 0);
    }

    static void Zadanie1_7() {
        int zad2;
        do {
            System.out.println("1. Operacja logiczna NOT\n2. Operacja logiczna XOR\n0. Koniec");
            Scanner in = new Scanner(System.in);
            zad2 = in.nextInt();
            switch (zad2) {
                case 1:
                    int a,
                     b;
                    System.out.println("Podaj obie zmienne: ");
                    Scanner not = new Scanner(System.in);
                    a = not.nextInt();
                    b = not.nextInt();
                    if (a > b) {
                        System.out.println("Zmienna a jest większa od zmiennej b");
                    } else {
                        System.out.println("Zmienna b jest większa od zmiennej a");
                    }
                    if (!(a > b)) {
                        System.out.println("NOT B jest większe od A");
                    } else {
                        System.out.println("NOT A jest większe lub równe B");
                    }
                    break;
                case 2:
                    int x,
                     y;
                    System.out.println("Podaj obie zmienne: ");
                    Scanner xor = new Scanner(System.in);
                    x = xor.nextInt();
                    y = xor.nextInt();
                    if (x % 2 == 0 || y % 2 == 0) {
                        System.out.println("Jedna z nich lub obie sa parzyste");
                    } else {
                        System.out.println("Zadna nie jest parzysta");
                    }
                    if (!(x % 2 == 0 || y % 2 == 0)) {
                        System.out.println("Zadna badz jedna jest parzysta");
                    } else {
                        System.out.println("Obie sa parzyste");
                    }
                    break;
            }
        } while (zad2 != 0);
    }

    static void Zadanie2_2() {
        String tekst = "Test";
        char[] tab = tekst.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i + "." + tab[i]);
        }
        byte[] byt = tekst.getBytes();
        for (int i = 0; i < byt.length; i++) {
            System.out.println(tab[i] + "=" + byt[i]);
        }
        String tekst2 = "Test2";
        boolean c;
        c = tekst2.equals(tekst2);
        System.out.println(c);
        c = tekst2.equalsIgnoreCase(tekst2);
        System.out.println(c);
        int i;
        i = tekst2.compareTo(tekst2);
        System.out.println(i);

        i = tekst2.compareToIgnoreCase(tekst2);
        System.out.println(i);

        //zwraca pozycje wybranej litery
        i = tekst2.indexOf("e");
        System.out.println(i);
        //zwraca pozyche wybranej litery od danego momentu szukania
        i = tekst2.indexOf("s", 2);
        System.out.println(i);

        i = tekst2.lastIndexOf("t");
        System.out.println(i);

        i = tekst2.lastIndexOf("t", 4);
        System.out.println(i);

        String tekst3;
        tekst3 = tekst.substring(2);
        System.out.println(tekst3);

        tekst3 = tekst.substring(1, 3);
        System.out.println(tekst3);
        
        String tekst4 = "Ala";
        tekst3 = tekst4.replace("A", "T");
        System.out.println(tekst3);

        String tekst5 = "          Ala ma kota";
        String tekst6 = tekst5.trim();
        System.out.println(tekst5);
        System.out.println(tekst6);

        tekst5 = tekst.toLowerCase();
        System.out.println(tekst5);

        tekst5 = tekst2.toUpperCase();
        System.out.println(tekst5);

        String tekst8 = "tttt-aaa-kkk";
        String tekst7[] = tekst8.split("-", 2);
        for (i = 0; i < tekst7.length; i++) {
            System.out.println(tekst7[i]);
        }

        String tekst9[] = tekst8.split("-");
        for (i = 0; i < tekst9.length; i++) {
            System.out.println(tekst9[i]);
        }
    }

    static void Zadanie3_3() {
        int zad3;
        do {
            System.out.println("1.Potegowanie for\n2.Potęgowanie rekurencyjnie\n0.Koniec");
            Scanner in = new Scanner(System.in);
            zad3 = in.nextInt();
            switch (zad3) {
                case 1:
                    int k,
                     n;
                    int w = 1;
                    System.out.println("Podaj podstawe i wykladnik:");
                    Scanner p = new Scanner(System.in);
                    k = p.nextInt();
                    n = p.nextInt();
                    for (int i = 1; i <= n; i++) {
                        w = w * k;
                    }
                    System.out.println(w);
                    break;
                case 2:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Podaj liczbę oraz wykladnik: ");
                    int liczba = sc.nextInt();
                    int wykladnik = sc.nextInt();
                    System.out.println(liczba + " ^ " + wykladnik + "=" + potegowanie(liczba, wykladnik));
                    break;
            }
        } while (zad3 != 0);
    }

    public static int potegowanie(int podstawa, int wykladnik) {
        if (wykladnik == 0) {
            return 1;
        } else {
            return podstawa * potegowanie(podstawa, wykladnik - 1);
        }
    }

    static void Zadanie3_4() {

        //Zadanie 3.4
        System.out.println("Podaj n ciagu");
        Scanner fib = new Scanner(System.in);
        int n = fib.nextInt();
        System.out.println("Suma ciagu: " + ciag(n));
    }

    public static int ciag(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return ciag(n - 1) + ciag(n - 2);
        }
    }

    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        int m;
        do {
            System.out.println("Menu:\nZadanie 1.4.\nZadanie 1.7.\nZadanie 2.2.\nZadanie 3.3.\nZadanie 3.4.\nKoniec 0.");
            Scanner menu = new Scanner(System.in);
            m = menu.nextInt();

            switch (m) {
                case 1:
                    Main.Zadanie1_4();
                    break;
                case 2:
                    Main.Zadanie1_7();
                    break;
                case 3:
                    Main.Zadanie2_2();
                    break;
                case 4:
                    Main.Zadanie3_3();
                    break;
                case 5:
                    Main.Zadanie3_4();
                    break;
            }
        } while (m != 0);
    }
}