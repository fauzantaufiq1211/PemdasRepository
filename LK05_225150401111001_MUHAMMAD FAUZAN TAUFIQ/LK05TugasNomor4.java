public class LK05TugasNomor4 {
    public static void main(String[] args) {
        System.out.print(" x|");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%3d| ", i);
        }
        System.out.printf("\n");
        for (int row = 1; row <= 10; row++) {
            System.out.printf("%2d|", row);
            for (int kolum = 1; kolum<=10; kolum++) {
                System.out.printf("%3d| ", row*kolum);
            }
            System.out.printf("\n");
        }
    }
}