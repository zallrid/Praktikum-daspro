package dasproJobsheet10;
import java.util.Scanner;

public class SurveyKepuasan {
    public static void main(String[] args) {
        int[][] hasilSurvey = new int[10][6];
        float[] rata2Responden = new float[10];
        float[] rata2Pertanyaan = new float[6];
        float rata2Keseluruhan;
        
        Scanner sc = new Scanner(System.in);

      
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan jawaban dari responden ke-" + (i+1) + ": ");
            for (int j = 0; j < 6; j++) {
                do {
                    System.out.print("  Pertanyaan ke-" + (j+1) + " (nilai 1-5): ");
                    hasilSurvey[i][j] = sc.nextInt();
                } while (hasilSurvey[i][j] < 1 || hasilSurvey[i][j] > 5);
            }
        }
        System.out.println();
        System.out.println("JUMLAH RATA-RATA SETIAP RESPONDEN");
        System.out.println("------------------------------");
        System.out.println();
        // RATA RATA TIAP RESPONDEN
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += hasilSurvey[i][j];
            }
            rata2Responden[i] = total / 6.0f;
            System.out.println("Rata-rata responden ke-" + (i+1) + ": " + rata2Responden[i]);
        }
        System.out.println();
        System.out.println("JUMLAH RATA-RATA SETIAP PERTANYAAN");
        System.out.println("------------------------------");
        System.out.println();

        // RATA RATA TIAP PERTANYAAN
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += hasilSurvey[i][j];
            }
            rata2Pertanyaan[j] = total / 10.0f;
            System.out.println("Rata-rata pertanyaan ke-" + (j+1) + ": " + rata2Pertanyaan[j]);
        }
        
        // RATA RATA KESELURUHAN
        int total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += hasilSurvey[i][j];
            }
        }
        System.out.println();
        System.out.println("JUMLAH RATA-RATA KESELURUHAN");
        System.out.println("------------------------------");
        System.out.println();
        rata2Keseluruhan = total / (10.0f * 6.0f);
        System.out.println("Rata-rata keseluruhan: " + rata2Keseluruhan);
        
        sc.close();
    }
}
