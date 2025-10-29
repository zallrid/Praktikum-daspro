package dasproJobsheet6;
import java.util.Scanner;

public class tugas1latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lamaSewa;
        String bensin;
        double totalBiayaSewa, jarakTempuh, bbm, totalBiaya, biayaSewaMobil, biayaSupir, pertalite = 1000,
                pertamax = 1300, hargaBahanBakar;
        biayaSewaMobil = 300000;
        biayaSupir = 200000;

        System.out.print("Pilih jenis bahan bakar pertalite / pertamax: ");
        bensin = sc.nextLine();

        if (bensin.equalsIgnoreCase("pertalite")) {
            hargaBahanBakar = pertalite;
        } else if (bensin.equalsIgnoreCase("pertamax")) {
            hargaBahanBakar = pertamax;
        } else {
            System.out.println("default ke pertalite");
            hargaBahanBakar = pertalite;
        }

        System.out.print("Berapa lama sewa: ");
        lamaSewa = sc.nextInt();

        if (lamaSewa > 30) {
            System.out.println("Tidak boleh lebih dari 30 hari");

        } else {

            System.out.print("Jarak Tempuh (Km): ");
            jarakTempuh = sc.nextDouble();
            totalBiayaSewa = (biayaSewaMobil + biayaSupir) * lamaSewa;
            bbm = hargaBahanBakar * jarakTempuh;
            totalBiaya = totalBiayaSewa + bbm;

            if (totalBiaya > 2000000) {
                double diskon = (totalBiaya * 0.05);
                totalBiaya -= diskon;

            } else {
                System.out.print("Maaf anda tidak dapat diskon");
            }
            System.out.println("Total biaya Rp" + (int) totalBiaya);

            sc.close();
        }
    }
}
