import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int m = scanner.nextInt();
            long value = 0;

            for (int i = -10; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    value += ((long) (i + j) * (i+j) * (i+j))/((long) j *j);
                }
            }

            System.out.print(value);
        }
    }
}

// </Ctrl+Z>
