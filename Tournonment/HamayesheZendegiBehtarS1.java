import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int row = scanner.nextInt();
            int number = scanner.nextInt();

            if (number > 10) {
                System.out.print("Left " + (11-row) + " " + (21-number));
            }else {
                System.out.print("Right " + (11-row) + " " + (number));
            }
        }
    }
}

// <Ctrl+Z>
