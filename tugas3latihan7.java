import java.util.Scanner;

public class tugas3latihan7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int publikasi = 300000;
        int dekorasi = 500000;
        int komsumsi = 500000;
        int hadiah = 4000000;
        int operasional = 500000;
        int komsumsiPeserta = 25000;
        int honorium = 75000;
        int biayaDaftar = 50000;
        double danaPolinema = 0;
        double biayaTetap, biayaTIm, sponsor, biayaSponsor;
        int jumlahTim;

        System.out.print("Masukkan jumlah tim: ");
        jumlahTim = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah bersedia memberikan dana bantuan ya / tidak: ");
        String bantuan = sc.nextLine();

        if (bantuan.equalsIgnoreCase("Ya")) {
            System.out.print("Anda ingin membantu berapa 0-100 dalam persen: ");
            double danaTambahan = sc.nextDouble();
            danaTambahan /= 100;
        } else if (bantuan.equalsIgnoreCase("tidak")) {
            System.out.println("Polinema tidak memberikan anggaran");
        }
        biayaTetap = publikasi + dekorasi + komsumsi + hadiah + operasional + (komsumsiPeserta * jumlahTim * 3) + (honorium * jumlahTim);
        biayaTIm = biayaDaftar * jumlahTim;
        biayaSponsor = danaPolinema * biayaTetap;
        sponsor = biayaTetap - (biayaSponsor + biayaTIm);

        if (sponsor <= 0) {
            System.out.print("Dana sudah cukup, tidak perlu sponsor");
        } else {
            System.out.print("Biaya Sponsor yg diperlukan Rp" + sponsor);
        }

        sc.close();
    }
}
