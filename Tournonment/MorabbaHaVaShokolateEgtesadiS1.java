import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int size = scanner.nextInt();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scanner.nextInt();
            }

            if (sum % size == 0) {
                System.out.print(n - (sum/size));
            }else {
                System.out.print(n - (1 + (sum/size)));
            }
        }
    }
}

// </Ctrl+Z>
