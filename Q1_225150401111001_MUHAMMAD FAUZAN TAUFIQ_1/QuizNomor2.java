import java.util.Random;
import java.util.Scanner;

public class QuizNomor2 {

    public static void main(String[] args) {
        int pilihan, komputer, hasil;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int gunting = 0;
        int batu = 1;
        int kertas = 2;
        System.out.println("Memulai program permainan Suit! Masukkan angka! (Gunting = 0, Batu = 1, Kertas = 2)");
        pilihan = input.nextInt();
        if (pilihan == 0) {
            komputer = random.nextInt(3);
            System.out.println("Komputer memilih " + komputer);
            if (komputer == 0) {
                System.out.println("Komputer adalah gunting. Kamu juga gunting. Yaaa...imbang");
            } else {
                if (komputer == 1) {
                    System.out.println("Komputer adalah batu. Kamu kalah. Coba lagi yuk");
                } else {
                    if (komputer == 2) {
                        System.out.println("Komputer adalah kertas. Kamu hebat. Kamu menang");
                    }
                }
            }
        } else {
            if (pilihan == 1) {
                komputer = random.nextInt(3);
                System.out.println("Komputer memilih " + komputer);
                if (komputer == 0) {
                    System.out.println("Komputer adalah gunting. Kamu hebat. Kamu menang");
                } else {
                    if (komputer == 1) {
                        System.out.println("Komputer adalah batu. Kamu juga batu. Yaaa...imbang");
                    } else {
                        if (komputer == 2) {
                            System.out.println("Komputer adalah kertas. Kamu kalah. Coba lagi yuk");
                        }
                    }
                }
            } else {
                if (pilihan == 2) {
                    komputer = random.nextInt(3);
                    System.out.println("Komputer memilih " + komputer);
                    if (komputer == 0) {
                        System.out.println("Komputer adalah gunting. Kamu kalah. Coba lagi yuk");
                    } else {
                        if (komputer == 1) {
                            System.out.println("Komputer adalah batu. Kamu hebat. Kamu menang");
                        } else {
                            if (komputer == 2) {
                                System.out.println("Komputer adalah kertas. Kamu juga kertas. Yaaa...imbang");
                            }
                        }
                    }
                }
            }
        }
    }
}