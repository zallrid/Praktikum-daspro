package Pertemuan14;
import java.util.Scanner;

public class Percobaan2No6 {

    static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("=== MENU CAFE ===");
        System.out.println("Selamat datang, " + namaPelanggan);

        if (isMember) {
            System.out.println("Status: MEMBER (punya hak diskon khusus)");
        } else {
            System.out.println("Status: BUKAN MEMBER");
        }

      
        System.out.println("1. Kopi Hitam   : 15000");
        System.out.println("2. Cappuccino   : 20000");
        System.out.println("3. Teh Tarik    : 12000");
        System.out.println("-------------------------");

       
        double totalBelanja = 50000;  

        System.out.println("Total belanja sebelum diskon: " + totalBelanja);

        double diskon = 0; 

       
        if (kodePromo.equals("DISKON50")) {
            diskon = 0.5;   
            System.out.println("Kode promo valid: DISKON50 (diskon 50%)");
        } else if (kodePromo.equals("DISKON30")) {
            diskon = 0.3;  
            System.out.println("Kode promo valid: DISKON30 (diskon 30%)");
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon.");
        }

        double potongan = totalBelanja * diskon;
        double totalSetelahDiskon = totalBelanja - potongan;

        System.out.println("Potongan: " + potongan);
        System.out.println("Total bayar: " + totalSetelahDiskon);
        System.out.println("============================\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();

        System.out.print("Apakah member? (ya/tidak): ");
        String jawaban = sc.nextLine();
        boolean isMember = jawaban.equalsIgnoreCase("ya");

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        
        Menu(nama, isMember, kodePromo);

        sc.close();
    }
}
