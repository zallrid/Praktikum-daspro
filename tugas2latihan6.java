import java.util.Scanner;
public class tugas2latihan6 {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double biayaBulanan, tarif, ppn, totalTarif, totalSemua;
        ppn = 0.1 ;
        biayaBulanan = 50000;

        System.out.print(" Pilih berapa Kwh 900 / 1300 / 2200 / 3500 / 5500 :  ");
        int kwh = sc.nextInt();

        switch (kwh){
            case 900:
            tarif = 1300;
            break;
            case 1300:
            case 2200:
            tarif = 1500;
            break;
            case 3500:
            case 5500:
            tarif = 1700;
            break;
            default:
            tarif = 1300;
            System.out.print("Secara otomatis anda kembali ke 900 kwh");
        }
        totalTarif = kwh * tarif;
        totalSemua = (biayaBulanan + totalTarif) * (1 + ppn);

        System.out.print("Biaya yang harus dibayar Rp" + (int)totalSemua);
        sc.close();

    }
}





