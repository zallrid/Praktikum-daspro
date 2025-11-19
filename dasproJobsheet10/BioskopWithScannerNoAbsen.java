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
                System.out.println("============================");
                System.out.print("Masukkan nama penonton: ");
                String nama = sc.nextLine();

                System.out.print("Masukkan baris (0-3): ");
                int baris = sc.nextInt();
                System.out.print("Masukkan kolom (0-1): ");
                int kolom = sc.nextInt();
                System.out.println("============================");
                sc.nextLine(); 

                
                
                
                penonton[baris][kolom] = nama;
            } else if (menu == 2) {
                System.out.println("============================");
                System.out.println("       Daftar Penonton");
                System.out.println("============================");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
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
