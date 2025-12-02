package Pertemuan14;

public class pengunjungKafe13 {
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("DAftar nama penguunjung: ");
        // for (int i = 0 ; i < namaPengunjung.length; i++) {
        //     System.out.println("- "+namaPengunjung[i]);
        // }
        for (String nama : namaPengunjung) {
            System.out.println("- "+nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Andi");
        daftarPengunjung("Doni","Eti","Fahmi", "Galih");
        
    }
}
