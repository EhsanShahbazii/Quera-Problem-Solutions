import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            BigDecimal num1 = scanner.nextBigDecimal();
            String operator = scanner.next();
            BigDecimal num2 = scanner.nextBigDecimal();

            if (operator.equals("+"))
                System.out.print(num1.add(num2));
            else
                System.out.print(num1.multiply(num2));
        }
    }
}

// </Ctrl+Z>
