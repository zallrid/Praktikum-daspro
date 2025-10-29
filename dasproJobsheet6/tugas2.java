package dasproJobsheet6;
import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;
        int max, min;

        System.out.print("Masukkan bilangan 1: ");
        A = sc.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        B = sc.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        C = sc.nextInt();

        // bilangan maksimum
        if (A > B) {
            if (A > C)
                max = A;
            else
                max = C;
        } else if (B > C) {
            max = B;
        } else {
            max = C;

        }
        // bilangan minimum
        if (A < B) {
            if (A < C) {
                min = A;

            } else {
                min = C;
            }
            ;
        } else {
            if (B < C)
                min = B;
            else
                min = C;
        }

        System.out.println("Bilangan maksimum: " + max);
        System.out.print("Bilangan minimum: " + min);
        sc.close();
    }
}
