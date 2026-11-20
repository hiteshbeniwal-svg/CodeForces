
import java.util.Scanner;

public class NumbersOnWhiteBoard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            System.out.println(2);

            if (n == 2) {
                System.out.println("1 2");
                continue;
            }

            System.out.println(n + " " + (n - 2));
            System.out.println((n - 1) + " " + (n - 1));

            for (int i = n - 3; i >= 1; i--) {
                System.out.println((i + 2) + " " + i);
            }
        }
    }
}