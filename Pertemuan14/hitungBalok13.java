package Pertemuan14;
import java.util.Scanner;

public class hitungBalok13 {

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static int hitungVolume(int panjang, int lebar, int tinggi) {
        int volume = panjang * lebar * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t;
        int luasPersegiPanjang, volumeBalok;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar   : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi  : ");
        t = input.nextInt();

        luasPersegiPanjang = hitungLuas(p, l);
        volumeBalok = hitungVolume(p, l, t);

        System.out.println("Luas persegi panjang = " + luasPersegiPanjang);
        System.out.println("Volume balok         = " + volumeBalok);

        input.close();
    }
}
