package dasproJobsheet7;

import java.util.Scanner;

public class tugasBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalTiket = 0, totalPendapatan = 0;
        double hargaTiket = 50000;

        System.out.println("Ketik '0' jika ingin mengakhiri input");

        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            int jumlahTiket = sc.nextInt();

            // keluar dari loop jika input 0
            if (jumlahTiket == 0) {
                break;
            }

            // jika input negatif → ulangi
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid (negatif), coba lagi.");
                continue;
            }

            // hitung total harga sebelum diskon
            double total = hargaTiket * jumlahTiket;
            double diskon = 0;

            // aturan diskon
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            // hitung total setelah diskon
            total -= total * diskon;

            // tampilkan hasil
            System.out.println("Total harga tiket anda adalah Rp " + total);

            // akumulasi untuk laporan akhir
            totalTiket += jumlahTiket;
            totalPendapatan += total;

            System.out.println("Total tiket terjual sementara: " + (int)totalTiket);
            System.out.println("Total pendapatan sementara: Rp " + totalPendapatan);
        }

        System.out.println("\nSemua transaksi selesai.");
        System.out.println("Total tiket terjual hari ini: " + (int)totalTiket);
        System.out.println("Total pendapatan hari ini: Rp " + totalPendapatan);
    }
}
