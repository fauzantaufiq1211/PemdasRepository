import java.util.Scanner;

public class lk06nomor1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, hasil;
        
        System.out.println("Masukkan bilangan pertama");
        bil1 = input.nextInt();
        System.out.println("Masukkan bilangan kedua");
        bil2 = input.nextInt();
        hasil = minNumber(bil1, bil2);
        System.out.print("Nilai terkecil adalah: ");
        System.out.println(hasil);
    }
    
    static int minNumber(int x, int y) {
        int min;
        
        if (x < y) {
            min = x;
        } else {
            min = y;
        }
        
        return min;
    }
}
