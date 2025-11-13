package dasproJobsheet9;
import java.util.Scanner;

public class arrayRataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lulus = 0;
        int tidakLulus = 0;
        int j = 0;
        double total= 0;
        double total1 = 0;
        double rataLulus, rataTdkLulus;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        
        int[] nilaiMhs = new int [jumlahMhs];
       while (j < jumlahMhs){

       


        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1)+ ": ");
            nilaiMhs[i] = sc.nextInt();


        }
    
        System.out.println("-------------------------");

         for (int i = 0; i < nilaiMhs.length; i++){
             if (nilaiMhs[i] > 70){
                 total += nilaiMhs[i];
                 lulus++;
            }else {
                total1 += nilaiMhs[i];
                tidakLulus++;
            }
        }
        rataLulus = total/lulus;
        rataTdkLulus = total1/tidakLulus;
        System.out.println("Mahasiswa yang lulus: "+lulus);
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus: "+ rataTdkLulus);

        break;
       }
}   
}
