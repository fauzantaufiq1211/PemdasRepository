import java.util.Scanner;

public class BelajarProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan nilai pembilang:");
        float pembilang = scn.nextFloat();
        System.out.println("Masukkan nilai penyebut:");
        float penyebut = scn.nextFloat();
        System.out.println("Saya sedang belajar PemDas");
        System.out.println(" Hasil baginya adalah " + pembilang / penyebut);
    
    scn.close();
    }
}
