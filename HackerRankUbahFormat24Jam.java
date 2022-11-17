import java.util.Scanner;

public class HackerRankUbahFormat24Jam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jam = input.nextLine();

        int x = Integer.parseInt(jam.substring(0, 2));
        int y = Integer.parseInt(jam.substring(3, 5));
        int z = Integer.parseInt(jam.substring(6));

        if ((x >= 0 && x < 24) && (y >= 0 && y <= 59) && (z >= 0 && z <= 59)) {
            if (x > 12) {
                if (x == 13) {
                    x = 1;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                } else if (x == 14) {
                    x = 2;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                } else if (x == 15) {
                    x = 3;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                } else if (x == 16) {
                    x = 4;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                } else if (x == 17) {
                    x = 5;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                } else if (x == 18) {
                    x = 6;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                } else if (x == 19) {
                    x = 7;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                } else if (x == 20) {
                    x = 8;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                } else if (x == 21) {
                    x = 9;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                } else if (x == 22) {
                    x = 10;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                } else if (x == 23) {
                    x = 11;
                    System.out.printf("%02d:%02d:%02d PM", x, y, z);
                }
            } else if (x >= 0 && x < 12) {
                if (x == 0) {
                    x = 12;
                    System.out.printf("%02d:%02d:%02d AM", x, y, z);
                } else {
                    System.out.printf("%02d:%02d:%02d AM", x, y, z);
                }
            } else if (x == 12) {
                System.out.printf("%02d:%02d:%02d PM", x, y, z);
            }
        } else {
            System.out.println("Format waktu yang anda masukkan salah");
        }
        input.close();
    }
}
