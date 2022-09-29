import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();

            int result = 0;
            if (n % 2 == 0) {
                result = (int) (0.25*(n*n + 4*n + 4));
                System.out.print(result);
            }else {
                result = (int) (0.25*(n*n + 4*n + 3));
                System.out.print(result);
            }
        }
    }
}

// </Ctrl+Z>
