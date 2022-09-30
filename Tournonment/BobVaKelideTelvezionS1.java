import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int k = scanner.nextInt();

            String[] channels = new String[n];

            for (int i = 0; i < n; i++) {
                channels[i] = scanner.next();
            }

            if (n == 1) {
                System.out.print(channels[0]);
            }else {
                int result = (x+k) % n;

                System.out.print(channels[result-1]);
            }
        }
    }
}

// </Ctrl+Z>
