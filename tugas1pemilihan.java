import java.util.Scanner;

public class tugas1pemilihan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lamaSewa;
        double totalBiayaSewa, jarakTempuh, bbm, totalBiaya, biayaSewaMobil, biayaSupir, hargaBahanBakar;
        biayaSewaMobil = 300000;
        biayaSupir = 200000;
        hargaBahanBakar = 1500;

        
        System.out.print("Lama Sewa (Hari): " );
        lamaSewa = sc.nextInt();
        
        if (lamaSewa > 30){
          System.out.println("Tidak boleh lebih dari 30 hari");
        
        } else {
            System.out.print("Jarak Tempuh (Km): ");
        jarakTempuh = sc.nextDouble();

        totalBiayaSewa = (biayaSewaMobil + biayaSupir) * lamaSewa ;
        bbm = hargaBahanBakar * jarakTempuh ;
        totalBiaya = totalBiayaSewa + bbm ;

        System.out.println("Total biaya Rp" + (int)totalBiaya);
        }

        

       sc.close();



    }
}


