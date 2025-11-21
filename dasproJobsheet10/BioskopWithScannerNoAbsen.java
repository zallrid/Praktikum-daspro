package dasproJobsheet10;

import java.util.Scanner;

public class BioskopWithScannerNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        do {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
    int baris, kolom;
    boolean kursiKosong;
    do {
        System.out.println("============================");
        System.out.print("Masukkan baris (0-3): ");
        baris = sc.nextInt();
        System.out.print("Masukkan kolom (0-1): ");
        kolom = sc.nextInt();

       
        if (baris < 0 || baris > 3 || kolom < 0 || kolom > 1) {
            System.out.println("Nomor kursi tidak tersedia. Silahkan coba lagi ;)");
            kursiKosong = false;
        } else if (penonton[baris][kolom] != null) {
            System.out.println("Kursi sudah terisi oleh penonton lain. Silahkan pilih kursi lain.");
            kursiKosong = false;
        } else {
            kursiKosong = true;
        }
        sc.nextLine(); 
    } while (!kursiKosong);

    System.out.print("Masukkan nama penonton: ");
    String nama = sc.nextLine();
    penonton[baris][kolom] = nama;
    System.out.println("============================");
}
            
             else if (menu == 2) {
                System.out.println("============================");
                System.out.println("       Daftar Penonton");
                System.out.println("============================");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if(penonton [i][j] == null){
                            System.out.print("****" + "\t");
                        } else
                        System.out.print(penonton[i][j] + "\t");
                    }

                    System.out.println();
                }
            }
        } while (menu != 3);

        System.out.println("Program selesai.");
        sc.close();
    }
}

