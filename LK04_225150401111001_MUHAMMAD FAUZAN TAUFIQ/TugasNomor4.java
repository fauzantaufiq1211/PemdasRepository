import java.util.Scanner;

public class TugasNomor4 {
    public static void main(String[] args) {
        String hariIni;
        int hari, x, n;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan hari ini");

        hariIni = input.nextLine();
        n = 0;

        switch (hariIni) {
            case "Senin":
                n = 1;
                break;
            case "Selasa":
                n = 2;
                break;
            case "Rabu":
                n = 3;
                break;
            case "Kamis":
                n = 4;
                break;
            case "Jumat":
                n = 5;
                break;
            case "Sabtu":
                n = 6;
                break;
            case "Minggu":
                n = 0;
                break;
            default:
                System.out.println("Input yang anda masukkan salah");
        }

        System.out.println("Masukan hari ke berapa ");
        hari = input.nextInt();

        x = (hari + n) % 7;

        if (x == 0) {
            System.out.println("Hari ke-" + hari + " adalah hari Minggu");
        } else if (x == 1) {
            System.out.println("Hari ke-" + hari + " adalah hari Senin");
        } else if (x == 2) {
            System.out.println("Hari ke-" + hari + " adalah hari Selasa");
        } else if (x == 3) {
            System.out.println("Hari ke-" + hari + " adalah hari Rabu");
        } else if (x == 4) {
            System.out.println("Hari ke-" + hari + " adalah hari Kamis");
        } else if (x == 5) {
            System.out.println("Hari ke-" + hari + " adalah hari Jumat");
        } else if (x == 6) {
            System.out.println("Hari ke-" + hari + " adalah hari Sabtu");
        } else {
            System.out.println("ERROR!!");
        }
        input.close();
    }
}