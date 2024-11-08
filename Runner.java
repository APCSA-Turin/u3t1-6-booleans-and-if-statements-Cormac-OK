import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("-- Set C --");
        boolean a, b, c, d; // NOTE you can declare multiple
                            // variables of same type like this
        a = false;
        b = !a;
        c = !(a || b);
        d = b && !(c && a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // reset variables
        a = false;
        b = false;
        c = true;
        if (a && b || c) {
        System.out.println("yes 1!");
        } else {
        System.out.println("no 1!");
        }

        if (a && (b || c)) {
        System.out.println("yes 2!");
        } else {
        System.out.println("no 2!");
        }

        if (c || b && a) {
        System.out.println("yes 3!");
        } else {
        System.out.println("no 3!");
        }

        if ((c || b) && a) {
        System.out.println("yes 4!");
        } else {
        System.out.println("no 4!");
        }



    }
}
