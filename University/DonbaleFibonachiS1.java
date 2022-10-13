import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n == 1) {
            System.out.print(1);
        }else {
            int[] fib = new int[1000000];
            fib[0] = 1;
            fib[1] = 1;
            int f1 = 1, f2 = 1, f3 = 2, i = 2;

            while(f3 <= n) {
                fib[i] = f3;
                i++;
                f1 = f2;
                f2 = f3;
                f3 = f1+f2;
            }

            for(int j = i-1; j >= 0; j--) {
                System.out.println(fib[j]);
            }
        }
    }
}
