import java.util.Scanner;

public class ProgramPencarianNilaiUTS {
    public static void main(String[] args) {
        int nilai;
        double bobot;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Silahkan masukan nilai akhir mahasiswa");
        nilai = input.nextInt();
        if ((nilai<=100) && (nilai>=0)){
        bobot = 0.3;
        double hasil = (double)(nilai * bobot * 100)/100.0d;
        
        System.out.printf("Nilai UTS anda adalah %.2f", hasil); 
        }
        else{
            System.out.println("Nilai yang anda masukkan tidak valid");
        }
         
        input.close();
    }
}   