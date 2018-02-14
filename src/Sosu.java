import java.util.Scanner;

public class Sosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean isPrime = false;

        for (int j = 0; j < 1000; j++) {
            for (int i = 2; i <= j; i++) {
                if (j % i == 0) {
                    break;
                }
                if (i == j - 1) {
                    System.out.print(j + " ");
                }
            }

        }
    }
}
