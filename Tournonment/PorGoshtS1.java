import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int a = 0, b = 0;

            for (int i = 0; i < 2*n; i++) {
                String input = scanner.next();

                if (i >= n) {
                    for (int j = 0 ; j < m; j++) {
                        if (input.charAt(j) == '*') {
                            b++;
                        }
                    }
                }else {
                    for (int j = 0 ; j < m; j++) {
                        if (input.charAt(j) == '*') {
                            a++;
                        }
                    }
                }
            }
            System.out.print(a + " " + b);
        }
    }
}

// </Ctrl+Z>
