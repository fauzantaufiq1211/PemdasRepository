import java.util.Scanner;

// dilarang mengubah code apa pun yang sudah tersedia. Hanya boleh menambahkan code
// di tempat yang di awali // TODO:
public class HackerRankBelahKetupat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tinggi;
        String kumpulanKarakter;

        tinggi = sc.nextInt();
        kumpulanKarakter = sc.next();
        sc.close();

        // TODO: panggil method gambarBelahKetupat dan ubahKeArrayOfChar untuk
        // menyelesaikan main method
        char[] character = ubahKeArrayOfChar(kumpulanKarakter);
        String hasil = gambarBelahKetupat(tinggi, character);
        System.out.print(hasil);
    }

    // method ini menerima parameter bertipe String yang kemudian dikonversi menjadi
    // array of character (char[])
    public static char[] ubahKeArrayOfChar(String s) {
        // TODO: selesaikan method ini
        char[] arraychar = new char[s.length()];
        for(int i = 0; i<s.length();i++){
            arraychar[i] = s.charAt(i);
        }
        return arraychar;

    }

    // sesuai namanya, method ini mengembalikan (return) sebuah string panjang yang
    // menghasilkan sebuah bentuk belah ketupat yang tersusun dari kumpulan karakter
    // yang telah diinputkan
    public static String gambarBelahKetupat(int tinggi, char[] daftarKarakter) {
        // TODO: selesaikan method ini
        String result = "";
        int bantu = 1;
        int bantu2 = 0;
        int a = 1;
        for(int i = 1;i <= (tinggi/2)+1; i++){
            String reverse = "";
            if (i != 1) {
                for(int j = tinggi; j > i+a; j--){
                    result += " ";
                }
                a++;
            } else{
                for(int j = tinggi; j > i; j--){
                    result += " ";
                }
            }
            for(int k=1;k<=bantu;k++){
                if(k <= i){
                    result += daftarKarakter[bantu2];
                    reverse += daftarKarakter[bantu2];
                    bantu2++;
                    if(i != 1){
                        result += " ";
                    }
                    if(bantu2 == daftarKarakter.length){
                        bantu2 = 0;
                    }
                } else{
                    for (int l = (reverse.length()-2); l >= 0; l--) {
                        result += reverse.charAt(l);
                        if(i != 1 && l != 0){
                            result += " ";
                        }
                    }
                    break;
                }
            }
            bantu+=2;
            bantu2 = 0;
            result += "\n";
        }
        bantu -= 4;
        a -= 2;
        for(int i=(tinggi/2);i>=1;i--){
            String reverse = "";
            if (i != 1) {
                for(int j=i;j<=((tinggi-1)-a);j++){
                    result += " ";
                }
                a--;
            } else {
                for(int j=i;j<=(tinggi-1);j++){
                    result += " ";
                }
            }
            for(int k=bantu;k>=1;k--){
                if(k >= i){
                    result += daftarKarakter[bantu2];
                    reverse += daftarKarakter[bantu2];
                    bantu2++;
                    if(i != 1){
                        result += " ";
                    }
                    if(bantu2 == daftarKarakter.length){
                        bantu2 = 0;
                    }
                } else{
                    for (int l = (reverse.length()-2); l >= 0; l--) {
                        result += reverse.charAt(l);
                        if(i != 1 && l != 0){
                            result += " ";
                        }
                    }
                    break;
                }
            }
            bantu-=2;
            bantu2 = 0;
            if(i > 1){
                result += "\n";
            }
        }
        return result;
    }
}