import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            long n = scanner.nextLong();
            long m = scanner.nextLong();

            System.out.print(gcd(n, m));
        }
    }

    public static long gcd(long p, long q) {
        if (q == 0)
            return p;
        else
            return gcd(q, p % q);
    }
}


// </Ctrl+Z>
