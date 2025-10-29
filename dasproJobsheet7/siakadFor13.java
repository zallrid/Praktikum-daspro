package dasproJobsheet7;
import java.util.Scanner;

public class siakadFor13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double nilai,tdkLulus = 0, kelulusan = 0, tertinggi = 0, terendah = 100;


        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                 tertinggi = nilai;
            }
            if(nilai < terendah){
                terendah = nilai;
            }
            if(nilai > 60){
                kelulusan++;
                
            }else if (nilai < 60){
                tdkLulus++;
            }
        
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Siswa yang lulus: " + (int)kelulusan);
        System.out.println("Siswa tidak lulus: "+ (int)tdkLulus);
    }   

}
