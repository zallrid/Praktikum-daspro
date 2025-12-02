package Pertemuan14;
import java.util.Scanner;

public class kafe13 {

    static void Menu(String namaPelanggan, boolean isMember, String kodePromo, int totalBelanja) {

        System.out.println("\n=== RINGKASAN PEMBAYARAN ===");
        System.out.println("Nama Pelanggan : " + namaPelanggan);

        if (isMember) {
            System.out.println("Status: MEMBER (punya hak diskon khusus)");
        } else {
            System.out.println("Status: BUKAN MEMBER");
        }

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

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
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

        System.out.println("\n=== MENU CAFE ===");
        System.out.println("1. Kopi Hitam   : 15000");
        System.out.println("2. Cappuccino   : 20000");
        System.out.println("3. Teh Tarik    : 12000");
        System.out.println("4. Latte        : 22000");
        System.out.println("5. Air Mineral  : 10000");
        System.out.println("6. Coklat Panas : 18000");
        System.out.println("-------------------------");


        System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
        int banyakJenisMenu = sc.nextInt();

        int totalKeseluruhan = 0;

        for (int i = 1; i <= banyakJenisMenu; i++) {
            System.out.println("\nPesanan ke-" + i + ":");
            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int subtotal = hitungTotalHarga(pilihanMenu, banyakItem);
            System.out.println("Subtotal pesanan ini: Rp " + subtotal);

            totalKeseluruhan += subtotal;
        }

        System.out.println("\nTotal seluruh pesanan sebelum diskon: Rp " + totalKeseluruhan);


        Menu(nama, isMember, kodePromo, totalKeseluruhan);

        sc.close();
    }
}
