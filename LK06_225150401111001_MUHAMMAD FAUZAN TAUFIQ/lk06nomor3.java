import java.util.Scanner;

public class lk06nomor3 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, hasil1, hasil2;
        
        System.out.println("Masukkan bilangan pertama");
        bil1 = input.nextInt();
        System.out.println("Masukkan bilangan kedua");
        bil2 = input.nextInt();
        hasil1 = numA(bil1, bil2);
        hasil2 = numB(bil1, bil2);
        System.out.print("Nilai pertama adalah: ");
        System.out.println(hasil1);
        System.out.print("Nilai kedua adalah: ");
        System.out.println(hasil2);
    }
    
    public static int numA(int x, int y) {
        x = y;
        
        return x;
    }
    
    public static int numB(int x, int y) {
        y = x;
        
        return y;
    }
}