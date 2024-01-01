import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if (i % a == 0 || i % b == 0 || i % c == 0 || i % d == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
