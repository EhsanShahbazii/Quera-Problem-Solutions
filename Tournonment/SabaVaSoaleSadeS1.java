import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            BigDecimal n = scanner.nextBigDecimal();
            int k =scanner.nextInt();
            BigDecimal num = BigDecimal.valueOf(2);
            BigDecimal pow = num.pow(k);
            num = n.divide(pow, RoundingMode.FLOOR);

            System.out.print(num);
        }
    }
}

// </Ctrl+Z>
