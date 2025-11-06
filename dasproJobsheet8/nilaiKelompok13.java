package dasproJobsheet8;
import java.util.Scanner;

public class nilaiKelompok13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nilai,totalNilai,kelompok = 0, rataNilai = 0;
    double tertinggi = 0, terendah = 100;

    

    for (int i = 1; i <= 6; i++) {
        System.out.println("Kelompok " + i);
       totalNilai = 0;

        for (int j = 1; j <= 5; j++){
            System.out.print("Masukkan nilai ke-"+ j + ": ");
            nilai = sc.nextDouble();
            totalNilai += nilai;

        }

        rataNilai = totalNilai/5;
        System.out.println("Rata-rata: " + rataNilai);
        
        
        if (rataNilai > tertinggi){
            tertinggi = rataNilai;
            kelompok = i;
        }
        if (rataNilai < terendah){
            terendah = rataNilai;
        }
    }
    


    System.out.println("Rata rata nilai tertinggi " + tertinggi + " kelompok " + (int)(kelompok));


}    
}
