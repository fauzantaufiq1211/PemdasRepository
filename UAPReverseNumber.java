import java.util.Scanner;
 
public class UAPReverseNumber{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        if (num == 196) 
        {
        System.out.println("Bilangan dilarang!");
        System.exit(0);
        }
    
        while (true) 
        {
        int kembali = kembali(num);
        int hasil = num + kembali;    
        System.out.println(num + " + " + kembali + " = " + hasil);    
     
        if (Palindrom(hasil)) 
        {
            System.out.println(hasil + " merupakan bilangan palindrome");
        break;
        }
        num = hasil;
        }
    }
    public static int kembali(int angka) {
        int kembali = 0;
        while (angka > 0) 
        {
          int digit = angka % 10;
          kembali = kembali * 10 + digit;
          angka /= 10;
        }
        return kembali;
    }
    public static boolean Palindrom(int nomor) {
        return nomor == kembali(nomor);
    }
}