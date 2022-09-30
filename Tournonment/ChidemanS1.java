import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int[] numbers = new int[n];

            int sum = 0, avg = 0, count = 0;
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
                sum += numbers[i];
            }

            avg = sum / n;

            for (int i = 0; i < n; i++) {
                if (numbers[i] > avg) {
                    count += numbers[i] - avg;
                }
            }

            System.out.print(count);
        }
    }
}

// </Ctrl+Z>
