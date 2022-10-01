import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.print(n/2);
            }else {
                int[] data = new int[n];
                for (int i = 1; i < n; i = i+2) {
                    if (n % i == 0)
                        data[i] = i;
                }

                System.out.print(max(data));
            }
        }
    }

    public static int max(int[] t) {
        int maximum = t[0];  
        for (int i=1; i<t.length; i++) {
            if (t[i] > maximum) {
                maximum = t[i]; 
            }
        }
        return maximum;
    }
}

// </Ctrl+Z>
