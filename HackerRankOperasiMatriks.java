import java.util.Scanner;

public class HackerRankOperasiMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris1, kolom1, baris2, kolom2;
        String operasi;

        baris1 = input.nextInt();
        kolom1 = input.nextInt();

        int[][] matriks1 = new int[baris1][kolom1];
        
        for(int a = 0; a < baris1; a++){
            for(int b = 0; b < kolom1; b++){
                matriks1[a][b] = input.nextInt();
            }
        }
        
        input.nextLine();
        operasi = input.nextLine();

        if (operasi.equals("tambah")){
            baris2 = input.nextInt();
            kolom2 = input.nextInt();
            int [][] matriks2 = new int [baris2][kolom2];
            for (int x = 0; x < matriks2.length; x++){
                for (int y = 0; y < matriks2[x].length; y++){
                    matriks2[x][y] = input.nextInt();
                }
            }
            if(baris1 == baris2 && kolom1 == kolom2){
                printMatriks(penjumlahan(matriks1, matriks2, baris1, kolom1));
            } else {
                System.out.println("Ordo kedua matriks tidak sama");
            }
                        
        } else if (operasi.equals("kurang")){
            baris2 = input.nextInt();
            kolom2 = input.nextInt();
            int [][] matriks2 = new int [baris2][kolom2];
            for (int x = 0; x < matriks2.length; x++){
                for (int y = 0; y < matriks2[x].length; y++){
                    matriks2[x][y] = input.nextInt();
                }
            }
            if(baris1 == baris2 && kolom1 == kolom2){
                printMatriks(pengurangan(matriks1, matriks2, baris1, kolom1));
            } else {
                System.out.println("Ordo kedua matriks tidak sama");
            }
        } else if (operasi.equals("kali")){
            baris2 = input.nextInt();
            kolom2 = input.nextInt();
            int [][] matriks2 = new int [baris2][kolom2];
            for (int x = 0; x < baris2; x++){
                for (int y = 0; y < kolom2; y++){
                    matriks2[x][y] = input.nextInt();
                }
            }
            if(kolom1 == baris2){
                printMatriks(perkalian(matriks1, matriks2, baris1, kolom2));
            } else {
                System.out.println("kolom matriks pertama tidak sama dengan baris matriks kedua");
            }
        } else {
            System.out.println("OPERASI TIDAK DIKENALI");
        } input.close();
    }
    static void printMatriks(int[][] matriks) {
        //JANGAN MENGUBAH KODE DI METHOD INI
        for (int i = 0; i < matriks.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.printf("%-4d ", matriks[i][j]);
            }
            System.out.println("|");
        }
    }

    static int[][] penjumlahan(int[][] array1, int array2[][], int baris, int kolom) {
        int[][] result = new int[baris][kolom];
        //lengkapi method ini
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }

    static int[][] pengurangan(int[][] array1, int array2[][], int baris, int kolom) {
        int[][] result = new int[baris][kolom];
        //lengkapi method ini
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                result[i][j] = array1[i][j] - array2[i][j];
            }
        }
        return result;
    }
    static int[][] perkalian(int[][] array1, int[][] array2, int baris, int kolom) {
        int[][] result = new int[baris][kolom];
        //lengkapi method ini
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                result[i][j] = 0;
                for(int k = 0; k < array1[i].length; k++){
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return result;
    }
}