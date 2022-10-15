import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int a = scanner.nextInt();
            int x = scanner.nextInt();
            int n = scanner.nextInt();

            long result = 0;

            for (int k = 0; k <= n; k++) {
                result += (factorial(n))/(factorial(k) * factorial(n-k)) * Math.pow(x, k) * Math.pow(a, n-k);
            }

            System.out.print(result);
        }

    }

    public static long factorial(long n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

}
