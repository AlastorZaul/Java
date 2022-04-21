import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        System.out.println("Scanner");
        scanner();

        System.out.println("Scan");
        scan();

        System.out.println("Temp");
        temp();

        System.out.println("Factorial");
        int fa = factorial(3);
        System.out.println(fa);

        System.out.println("Reverse");
        String rev = reverse("WayToLearnX");
        System.out.println(rev);

        System.out.println("Max");
        int[] tab = {1, 2, 9, 4};
        int max = maximum(tab);
        System.out.println("le nombre maximum de ce tableau est: " + max);

        System.out.println("ASCII");
        ascii();

        System.out.println("Length");
        length();

        System.out.println("time");
        time();

        System.out.println("date");
        date();

        System.out.println("modulo");
        int n = 15;
        System.out.print(modulo(n));

        System.out.println("check");
        int nbr = 2;
        System.out.print(check(nbr));

        System.out.println("fibonacci");
        int nbr2 = 8;
        System.out.print(fibonacci(nbr2));
    }

    public static void scanner(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer un nombre: ");
        int n = sc.nextInt();

        for (int i=0; i<10; i++){
            System.out.println(n + " x " + (i+1) + " = " + (n * (i+1)));
        }
    }

    public static void scan(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le premier nombre: ");
        int nbr1 = sc.nextInt();
        System.out.print("Entrer le deuxième nombre: ");
        int nbr2 = sc.nextInt();
        System.out.print("Entrer le deuxième nombre: ");
        int nbr3 = sc.nextInt();

        System.out.println(nbr1 + " x " + nbr2 + " x " + nbr3 + " = " + nbr1 * nbr2 * nbr3);
        System.out.println("La moyenne est: "+(nbr1 + nbr2 + nbr3) / 3);
    }

    public static void temp(){
        int a, b, tmp;
        a = 1;
        b = 2;
        System.out.println("Avant l'échange: a = "+a+", b = "+b);

        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Après l'échange: a = "+a+", b = "+b);
    }

    public static int factorial(int n){
        int f = n;

        for (int j = n - 1; j > 0; j--) {
            f = f * j;
        }
        return f;
    }

    public static String reverse(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            res.append(str.charAt(str.length() - i - 1));
        }
        return res.toString();
    }

    public static int maximum(int[] tab) {
        int max = tab[0];
        for (int i : tab) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void ascii () {
        int chr = 'A';
        System.out.println("La valeur ASCII de A est: "+chr);
    }

    public static void length () {
        long size1 = new File("file1.txt").length();
        long size2 = new File("file2.txt").length();
        System.out.println("file1.txt : "+ size1 +" octets");
        System.out.println("file2.txt : "+ size2 +" octets");
    }

    public static void time () {
        System.out.format("La date du systéme est: %tc", System.currentTimeMillis());
    }

    public static void date () {
        SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        s.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.println(s.format(System.currentTimeMillis()));
    }

    public static String modulo (Integer n) {
        String res = "";
        if (n % 3 == 0) {
            res += "Fizz";
        }
        if (n % 5 == 0) {
            res += "Buzz";
        }
        if (res.equals("")) {
            res = n.toString();
        }
        return res;
    }

    public static Boolean check(int n) {
        boolean nbrPremier = true;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                nbrPremier = false;
                break;
            }
        }
        return nbrPremier;
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}