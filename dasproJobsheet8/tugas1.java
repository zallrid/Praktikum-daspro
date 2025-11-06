package dasproJobsheet8;
public class tugas1 {
    public static void main(String[] args) {
        int total = 0;
        
        for (int i = 1; i <= 5; i++){
            System.out.print("n = " + i +" ");
            System.out.print("Jumlah kuadrat = ");

            for (int j = 1;j <= i; j++){
                int n = (j*j);
                total += n;
                System.out.print(n);
                if (j < i){
                    System.out.print(" + ");
                }
            }
            if (i != 1){
                System.out.print(" = ");
                System.out.println(total);
            } else {
                System.out.println( );
            }
        }

    }
}
