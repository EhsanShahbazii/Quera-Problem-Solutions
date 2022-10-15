import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        BigDecimal sum = BigDecimal.valueOf(0);
        for (int i = 1; i <= n; i++) {
            sum = sum.add(multi(i));
        }

        System.out.print(sum);
    }

    public static BigDecimal fact(int n) {
        BigDecimal result = BigDecimal.valueOf(1);
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }

        return result;
    }

    public static BigDecimal comb(int n, int m) {
        return fact(n).divide(fact(m).multiply(fact(n-m)), BigDecimal.ROUND_CEILING);
    }

    public static BigDecimal multi(int i) {
        BigDecimal results = BigDecimal.valueOf(1);
        for (int j = 1; j <= i; j++) {
            results = results.multiply(comb(i, j));
        }

        return results;
    }

}
