import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n == 1 || n == 2 || n == 3 || n == 4 || n == 6 || n == 12) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
