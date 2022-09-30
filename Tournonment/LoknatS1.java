import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.next();

            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'F' || input.charAt(i) == 'L' || input.charAt(i) == 'T' || input.charAt(i) == 'D')
                    count++;
            }

            System.out.print((int) Math.pow(2,count));
        }
    }
}

// </Ctrl+Z>
