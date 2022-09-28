import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();

            int[] fib = new int[n];
            int f1 = 1;
            fib[0] = 1;
            if (n == 1) {
                System.out.print("+");
            } else if (n == 2) {
                System.out.print("++");
            } else if (n == 3) {
                System.out.print("+++");
            }else {
                int f2 = 1;
                fib[1] = 1;
                int f3 = 2;
                int i = 2;

                while (f3 <= n) {
                    fib[i] = f3;
                    f1 = f2;
                    f2 = f3;
                    f3 = f1+f2;
                    i++;
                }
                boolean test = false;
                for(int j = 1; j <= n; j++) {
                    int finalJ = j;
                    test = IntStream.of(fib).anyMatch(x -> x == finalJ);
                    if (test) {
                        System.out.print("+");
                        test = false;
                    }else {
                        System.out.print("-");
                    }
                }
            }
        }
    }
}

// </Ctrl+Z>
