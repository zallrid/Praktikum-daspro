package dasproJobsheet9;
import java.util.Scanner;

public class arrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int lulus = 0;
        double total= 0;
        double rata2;


        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+ ": ");
            nilaiMhs[i] = sc.nextInt();


        }

        System.out.println("-------------------------");

         for (int i = 0; i < nilaiMhs.length; i++){
             total += nilaiMhs[i];
             if (nilaiMhs[i] > 70){
                 lulus++;
            }
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Mahasiswa yang lulus: "+lulus);
        System.out.println("Rata-rata nilai = "+rata2);


    
}   
}
