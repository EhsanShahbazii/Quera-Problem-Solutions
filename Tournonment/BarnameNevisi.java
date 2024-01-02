import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (n <= 60) {
            System.out.println(n * 1500);
        } else {
            int x = 60 * 1500;
            if (n - 60 <= k) {
                System.out.println(x + (n - 60) * 1500);
            } else {
                System.out.println(x + k * 1500 + (n - 60 - k) * 3000);
            }
        }
    }
}
