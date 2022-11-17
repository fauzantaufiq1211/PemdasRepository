import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nilai : ");
        int x = input.nextInt();
        System.out.print("Maka bilangan fibonacci adalah : ");
        int y = fibonacci(x);
        System.out.println(y);
        input.close();
    }
    public static int fibonacci(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        return fibonacci(x-1) + fibonacci(x-2);
    }
}