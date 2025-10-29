package dasproJobsheet6;
import java.util.Scanner;

public class tugas4latihan8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double biayaCetak = 200;
        double hc = 20000;
        double beratLembar = 0.003;
        double beratPacking = 0.3;
        double ongkir = 15000;
        double totalBiayaCetak, beratHc, totalBerat, totalBiaya, jumlahHalaman;

        System.out.print("Pilih cover (Hard cover / Soft cover): ");
        String cover = sc.nextLine();
        System.out.print("Jumlah Halaman : ");
        jumlahHalaman = sc.nextDouble();
        sc.nextLine();

        if (cover.equalsIgnoreCase("Hard cover")) {
            System.out.println("Biaya Rp20.000");
            hc = 20000;
            beratHc = 0.250;
        } else {
            System.out.println("Biaya Rp10.000");
            hc = 10000;
            beratHc = 0.100;
        }

        totalBiayaCetak = jumlahHalaman * biayaCetak;
        totalBerat = Math.ceil(jumlahHalaman / 2) * beratLembar + beratHc + beratPacking;
        totalBiaya = Math.ceil(totalBerat) * ongkir + totalBiayaCetak + hc;

        System.out.println("Total Berat Kg" + totalBerat);
        System.out.print("Total Biaya Rp" + totalBiaya);

        sc.close();

    }
}
