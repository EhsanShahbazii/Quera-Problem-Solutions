import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int l = scanner.nextInt();
            int result;
            int aCount, bCount;

            if (l % 2 == 0) {
                aCount = l/2 * a;
                bCount = l/2 * b;
            }else {
                if (l == 2) {
                    bCount = b;
                }else {
                    bCount = (l-1)/2 * b;
                }
            }

            result = ((l+1)/2) * a + bCount;

            System.out.print(result);
        }
    }
}

// <Ctrl+Z>
