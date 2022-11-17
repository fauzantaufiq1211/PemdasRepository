import java.util.Scanner;

public class UTPNIMEkstraktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, jalurMasuk, prodi, NIM;
        int Lulus, angkatan, x, y, z;

        nama = input.nextLine();
        NIM = input.nextLine();
        x = Integer.parseInt(NIM.substring(5, 7));
        y = Integer.parseInt(NIM.substring(7, 9));
        z = Integer.parseInt(NIM.substring(0, 2));
        jalurMasuk = "";
        angkatan = 0;
        Lulus = 0;

        if (NIM.length()==15){
            angkatan = z;
            Lulus = angkatan + 3;
            System.out.println("============================================================");
            System.out.println("=================DETAIL INFORMASI MAHASISWA=================");
            System.out.printf("%-13s: %s%n", "NAMA", nama);
            System.out.printf("%-13s: %s%n", "NIM", NIM);
            if (x==04){
                prodi = "SISTEM INFORMASI";
                if (y==0){
                    jalurMasuk = "SBMPTN";
                }else if (y==1){
                    jalurMasuk = "SNMPTN";
                }else if (y==7){
                    jalurMasuk = "MANDIRI";
                }      
            }else{
                prodi = "LUAR SISTEM INFORMASI";
                if(y==0){
                    jalurMasuk = "SBMPTN";
                }else if(y==1){
                    jalurMasuk = "SNMPTN";
                }else if(y==7){
                    jalurMasuk = "MANDIRI";
                }
            }
            System.out.printf("%-13s: %s%n", "JALUR MASUK", jalurMasuk);
            System.out.printf("%-13s: %s%n", "PROGRAM STUDI", prodi);
            System.out.printf("%-13s: 20%d%n", "ANGKATAN", angkatan);
            System.out.printf("%-13s: 20%d%n", "TAHUN LULUS", Lulus);
            System.out.println("============================================================");

        
        }else if (NIM.length() !=15){
            System.out.println("============================================================");
            System.out.println("NIM TIDAK VALID!!");
            System.out.println("============================================================");
        }
        input.close();
    }
}