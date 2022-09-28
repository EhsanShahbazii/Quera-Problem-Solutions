import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            BigDecimal[] data = new BigDecimal[4];
            BigDecimal sum = BigDecimal.valueOf(0), avg = BigDecimal.valueOf(0),
                    product = BigDecimal.valueOf(1);

            for (int i = 0; i < 4; i++) {
                data[i] = scanner.nextBigDecimal();
                sum = sum.add(data[i]);
                product = product.multiply(data[i]);
            }

            avg = sum.divide(BigDecimal.valueOf(4), MathContext.DECIMAL32);
            Arrays.sort(data);

            System.out.format("Sum : %f",sum);
            System.out.println("");
            System.out.format("Average : %f", avg);
            System.out.println("");
            System.out.format("Product : %f", product);
            System.out.println("");
            System.out.format("MAX : %f", data[data.length -1]);
            System.out.println("");
            System.out.format("MIN : %f", data[0]);
        }
    }
}

// </Ctrl+Z>
