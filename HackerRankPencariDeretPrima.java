import java.util.Scanner;

public class HackerRankPencariDeretPrima {
    public static void main(String[] args) {
        int n, bil, x;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        bil = 1;
        x = 0;

        if(n <= 0){
            System.out.println("banyak bilangan prima pertama yang ditemukan TIDAK ADA TEST CASE NEGATIF DAN NOL");
        }else{
            for(int i = 1; i < 10000; i++){
                bil = 0;
                for(int j = 1; j <= i; j++){
                    if(i % j == 0){
                        bil = bil + 1;
                    }
                }
                if(bil == 2){
                    x = x + 1;
                    System.out.println(i);
                    if(x == n){
                        break;
                    }
                }
            }       
        }input.close();
    }
}
