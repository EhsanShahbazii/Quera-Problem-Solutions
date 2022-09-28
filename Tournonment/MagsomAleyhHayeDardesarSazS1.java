import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();

            long sum = 0, count = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                        sum += j;
                    }
                }
            }

            System.out.print(count + " " + sum);
        }
    }
}

// </Ctrl+Z>
