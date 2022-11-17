import java.util.Scanner;

public class lk06nomor2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, bil3, hasil;
        
        System.out.println("Masukkan bilangan pertama");
        bil1 = input.nextInt();
        System.out.println("Masukkan bilangan kedua");
        bil2 = input.nextInt();
        System.out.println("Masukkan bilangan ketiga");
        bil3 = input.nextInt();
        hasil = minNumber(bil1, bil2, bil3);
        System.out.print("Nilai terkecil adalah: ");
        System.out.println(hasil);
    }
    
    public static int minNumber(int x, int y, int z) {
        int min;
        
        min = 0;
        if (x < y && x < z) {
            min = x;
        } else {
            if (y < x && y < z) {
                min = y;
            } else {
                if (z < x && z < y) {
                    min = z;
                }
            }
        }
        
        return min;
    }
}