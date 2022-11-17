import java.util.Scanner;

public class HackerRankKantongKering {
    public static void main(String[] args) {
        int batas, uang, sisa, x1, x2, y1, y2, tarifOjek, totalBiaya;
        double jarak;
        long uangOjek;
        Scanner input = new Scanner(System.in);
        tarifOjek = 15000;
        batas = input.nextInt();
        uang = input.nextInt();
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        jarak = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        uangOjek = Math.round(tarifOjek * jarak);
        totalBiaya = (int) (uangOjek + uang);
        System.out.printf("%-20s: %.2f km %n", "Jarak", jarak);
        System.out.printf("%-20s: Rp %,d %n", "Total biaya", totalBiaya);
        System.out.printf("%-20s: Rp %,d %n", "Batas pengeluaran", batas);
        sisa = batas - totalBiaya;

        if (sisa > 0) {
            System.out.printf("%nMasih ada sisa uang, gas pesen ojol!");
        } else if (sisa < 0) {
            System.out.printf("%nUangmu tidak cukup, kamu harus jalan kaki!");
        } else if (sisa == 0) {
            System.out.printf("%nSisa uangmu akan menjadi Rp 0, terserah padamu.");
        }
        input.close();
    }
}