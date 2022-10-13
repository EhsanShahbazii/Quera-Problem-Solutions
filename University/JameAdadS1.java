import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int count = scanner.nextInt();
            BigDecimal result = BigDecimal.valueOf(0);

            for (int i = 0; i < count; i++) {
                BigDecimal num = scanner.nextBigDecimal();
                result = result.add(num);
            }
            System.out.print(result);
        }
    }
}
