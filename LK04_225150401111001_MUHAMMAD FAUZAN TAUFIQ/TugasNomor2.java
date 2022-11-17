import java.util.Scanner;

public class TugasNomor2 {
    public static void main(String[] args) {
        System.out.println("Masukkan nilai n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int hari = n % 7;
        switch (hari) {
            case 0:
                System.out.println(" Hari ke- " + n + " adalah hari Minggu ");
                break;
            case 1:
                System.out.println(" Hari ke- " + n + " adalah hari Senin ");
                break;
            case 2:
                System.out.println(" Hari ke- " + n + " adalah hari Selasa");
                break;
            case 3:
                System.out.println(" Hari ke- " + n + " adalah hari Rabu");
                break;
            case 4:
                System.out.println(" Hari ke- " + n + " adalah hari Kamis");
                break;
            case 5:
                System.out.println(" Hari ke- " + n + " adalah hari Jum'at");
                break;
            case 6:
                System.out.println(" Hari ke- " + n + " adalah hari Sabtu");
                break;
            default:
                System.out.println("Input yang anda masukkan salah");
        }

        input.close();
    }

}