  import java.util.Scanner;
public class ugas1latihan2 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lamaSewa;
        double totalBiayaSewa, jarakTempuh, bbm, totalBiaya, biayaSewaMobil, biayaSupir, hargaBahanBakar = 1000;
        biayaSewaMobil = 300000;
        biayaSupir = 200000;

        
        
        System.out.print("Berapa lama sewa: ");
        lamaSewa = sc.nextInt();
        System.out.print("Jarak Tempuh (Km): ");
        jarakTempuh = sc.nextDouble();

        totalBiayaSewa = (biayaSewaMobil + biayaSupir) * lamaSewa;
        bbm = hargaBahanBakar * jarakTempuh;
        totalBiaya = totalBiayaSewa + bbm;

        if (totalBiaya > 2000000) {
           double diskon = (totalBiaya*0.05);
           totalBiaya -= diskon;

        } else  {
            System.out.print("Maaf anda tidak dapat diskon");
        }

        

        System.out.println("Total biaya Rp" + (int) totalBiaya);

        sc.close();
    }
}




