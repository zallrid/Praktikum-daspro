package dasproJobsheet10;
import java.util.Scanner;

public class siakad13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] nilai = new int[4][3];

    for (int i = 0; i < nilai.length; i++) {
        System.out.println("Imput nilai mahasiswa ke-" + (i+1) + ": ");
        for (int j = 0; j < nilai[i].length; j++) {
            System.out.print("Nilai mata kuliah " + (i+1) + ": ");
            nilai[i][j] = sc.nextInt();
        }
    }
}    
}
