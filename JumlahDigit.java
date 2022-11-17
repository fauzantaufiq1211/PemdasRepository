import java.util.Scanner;

public class JumlahDigit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bilangan; 
        int bilganjil, bilgenap, x, y;
        bilganjil = 0;
        bilgenap = 0;
    
        bilangan = input.nextLine();
            for (int i=0;i<bilangan.length();i+=2){
                x = Integer.parseInt (bilangan.substring(i,i+1));    
                bilganjil +=x;
            }
            for (int i=1;i<bilangan.length();i+=2){
                y = Integer.parseInt (bilangan.substring(i,i+1));
                bilgenap +=y;
            }
        System.out.println(bilganjil + ""+bilgenap);
        input.close();
    }
}