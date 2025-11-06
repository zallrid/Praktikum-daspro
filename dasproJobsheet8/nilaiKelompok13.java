package dasproJobsheet8;
import java.util.Scanner;

public class nilaiKelompok13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nilai, totalNilai = 0, rataNilai;

    int i = 1;

    while (i <= 6) {
        System.out.println("Kelompok " + i);
       
        for (int j = 1; j <= 5; j++){
            System.out.print("Masukkan nilai ke-"+ j + ": ");
            nilai = sc.nextDouble();
            totalNilai += nilai;

        }

        rataNilai = totalNilai/5;
        System.out.println("Rata-rata: " + rataNilai);
        i++;

    }


}    
}
