import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            long num1 = scanner.nextLong();
            long num2 = scanner.nextLong();
            if (num1 < 0)
                num1 *= -1;
            if (num2 < 0)
                num2 *= -1;

            System.out.print(gcd(num1, num2));
        }
    }

    public static long gcd(long p, long q) {
        if (q == 0)
            return p;
        else
            return gcd(q, p % q);
    }
}
