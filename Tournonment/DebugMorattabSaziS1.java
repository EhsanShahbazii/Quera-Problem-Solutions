import java.util.Scanner;
//Ehsan Shahbazi

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i+1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = i; j + 1 < n; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[n - i - 1]);
                if (i == n - 1)
                    System.out.println();
                else
                    System.out.print(' ');
            }
        }
    }
}

// </Ctrl+Z>
