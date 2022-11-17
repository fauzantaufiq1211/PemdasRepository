import java.util.Scanner;

public class UTPIpinBelajarPecahan {
    public static void main(String[] args) {
        String nilai;
        double desimal, persen;
        long x, y, bagi, hModul, pecahan, q;

        try (Scanner input = new Scanner(System.in)) {
            nilai = input.next();
        }
        x = Long.parseLong(nilai.substring(0, nilai.indexOf("/")));
        y = Long.parseLong(nilai.substring(nilai.indexOf("/")+1));
        bagi = x/y;
        hModul = x % y;
        desimal = (double)x/(double)y ;
        persen = ((double)x/(double)y)*100;
        
        if(bagi != 0){
            System.out.printf("%-26s: %s\n", "Bentuk pecahan murni", nilai);
            if(x < y){
                pecahan = hModul%y;
                if(pecahan < 0){
                    q = pecahan * -1;
                    System.out.printf("%-26s: %d %d/%d\n", "Bentuk pecahan campuran", bagi, q, y);
                }else{
                    System.out.printf("%-26s: %d %d/%d\n", "Bentuk pecahan campuran", bagi, pecahan, y);
                }
            }else{
                System.out.printf("%-26s: %d %d/%d\n", "Bentuk pecahan campuran", bagi, hModul, y);
            }
            System.out.printf("%-26s: %.2f\n", "Bentuk desimal", desimal);
            System.out.printf("%-26s: %.1f%s\n", "Bentuk persen", persen, "%");
        }else{
            System.out.printf("%-26s: %s\n", "Bentuk pecahan murni", nilai);
            System.out.printf("%-26s: %s\n", "Bentuk pecahan campuran", "-");
            System.out.printf("%-26s: %.2f\n", "Bentuk desimal", desimal);
            System.out.printf("%-26s: %.1f%s\n", "Bentuk persen", persen, "%");
        }
    }
}
