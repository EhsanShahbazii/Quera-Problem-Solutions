import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int[] aArray = new int[n];
            int[] bArray = new int[n];
            for(int i = 0; i < n; i++) {
                aArray[i] = scanner.nextInt();
            }
            for(int i = 0; i < n; i++) {
                bArray[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += aArray[i] * bArray[i];
            }

            System.out.print(sum);
        }
    }
}

// </Ctrl+Z>
