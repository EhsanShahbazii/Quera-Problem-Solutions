import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            long n = scanner.nextLong();
            int b = scanner.nextInt();

            String result = Integer.toString(Integer.parseInt(String.valueOf(n), 10), b);
            System.out.print(result.toUpperCase(Locale.ROOT));
        }
    }
}
