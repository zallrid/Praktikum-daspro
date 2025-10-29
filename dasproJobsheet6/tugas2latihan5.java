package dasproJobsheet6;
 import java.util.Scanner;

public class tugas2latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double biayaBulanan, tarif, ppn, kwh, totalTarif, totalSemua;
        ppn = 0.1 ;
        biayaBulanan = 50000;

        System.out.print(" Pilih berapa Kwh 900 / 1300 / 2200 / 3500 / 5500 :  ");
        kwh = sc.nextDouble();

        if (kwh == 900 ){
            tarif = 1300;
        } else if (kwh == 1300 || kwh == 2200){
            tarif = 1500;
        } else if (kwh == 3500 || kwh == 5500 ){
            tarif = 1700;
        } else {
            System.out.print("Silahkan pilih daya terlebih dahulu");
            tarif = 0;
        }
        totalTarif = kwh * tarif;
        totalSemua = (biayaBulanan + totalTarif) * (1 + ppn);

        System.out.print("Biaya yang harus dibayar Rp" + (int)totalSemua);
        sc.close();

    }
}



