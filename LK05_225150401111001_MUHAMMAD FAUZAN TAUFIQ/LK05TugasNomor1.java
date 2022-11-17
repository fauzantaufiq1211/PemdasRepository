import java.util.Scanner;

public class LK05TugasNomor1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int m, n, x, penjumlahan;
        
        System.out.println("Masukkan m");
        m = input.nextInt();
        System.out.println("Masukkan n");
        n = input.nextInt();
        penjumlahan = 0;
        for (x = 1; x <= m; x++) {
            penjumlahan = penjumlahan + n;
        }
        System.out.println("Hasil perkalian "+m+"x"+n+" adalah "+penjumlahan);
        input.close();
    }
}