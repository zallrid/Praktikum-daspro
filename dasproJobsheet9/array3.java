package dasproJobsheet9;
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     



        // Deklarasi array nama bulan
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        Scanner input = new Scanner(System.in);

        // Input dari user
        System.out.print("Masukkan angka bulan (1 - 12): ");
        int inputUser = input.nextInt();

        // Proses dan output
        if (inputUser >= 1 && inputUser <= 12) {
            System.out.println("Bulan ke-" + inputUser + " adalah " + bulan[inputUser - 1]);
        } else {
            System.out.println("Input tidak valid! Harus angka 1 - 12.");
        }

        input.close();
    }
}


    

