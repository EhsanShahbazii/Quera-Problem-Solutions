import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int x = scanner.nextInt();
            int n = scanner.nextInt();
            BigDecimal result = BigDecimal.valueOf(0);

            for (int i = 1; i <= n; i++) {
                result = result.add(pows(x, i-1).divide(factorial(i-1), MathContext.DECIMAL128));
            }

            System.out.format("%.3f", result);
        }
    }

    public  static BigDecimal factorial(long n){
        if (n == 0)
            return BigDecimal.valueOf(1);
        else
            return(BigDecimal.valueOf(n).multiply(factorial(n-1)));
    }

    public  static BigDecimal pows(long num, int n){
        BigDecimal result = BigDecimal.valueOf(1);
        for (int i = 0; i < n; i++) {
            result = result.multiply(BigDecimal.valueOf(num));
        }
        return result;
    }

}
