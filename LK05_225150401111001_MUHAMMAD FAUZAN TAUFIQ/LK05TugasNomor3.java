import java.util.Scanner;

public class LK05TugasNomor3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    int m, n, x, pembagian;
            
    System.out.println("Masukkan m");
    m = input.nextInt();
    System.out.println("Masukkan n");
    n = input.nextInt();
    pembagian = 0;
    for (x = m; x >= 1; x -= n) {
        pembagian = pembagian + 1;
        }
    System.out.println("Hasil "+m+"/"+n+" adalah "+pembagian);
    input.close();
    }
}