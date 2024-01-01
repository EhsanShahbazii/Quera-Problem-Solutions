import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int am = scanner.nextInt();
        int bm = scanner.nextInt();
        int as = scanner.nextInt();
        int bs = scanner.nextInt();
        int x = scanner.nextInt();

        if ((am + x * bm) >= (as + x * bs)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
