package dasproJobsheet9;

import java.util.Scanner;

public class searchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = 0;
        int hasil = 0;
        int k = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlNilai = sc.nextInt();

        int[] arrNilai = new int[jmlNilai];
        while (k < jmlNilai) {
            for (int i = 0; i < arrNilai.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                arrNilai[i] = sc.nextInt();

            }
            System.out.println("--------------------------------------");
            System.out.print("Masukkan nilai yang ingin dicari: ");
            key = sc.nextInt();
            

            for (int i = 0; i < arrNilai.length; i++) {
                if (key == arrNilai[i]) {
                    hasil = i;
                    System.out.println();
                    System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
                    break;
                }
            }
           
            System.out.println();

            break;
        }
    }
}
