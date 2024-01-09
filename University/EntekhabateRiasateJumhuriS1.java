import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(person(n, 2) + 1);
    }
    public static int person (int n, int k) {
        if (n == 1) {
            return 0;
        } else {
            return (person(n - 1, k) + k) % n;
        }
    }
}
