import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int i = 1, remain = 0, xRemain = x;
            boolean flag = true;
            while(x <= n && flag) {
                x = xRemain*i;
                remain = n - x;
                if (remain % y == 0) {
                    flag = false;
                }
                i++;
            }

            if (!flag && ((n-x)/y) >= 0) {
                System.out.print(i-1 + " " + ((n-x)/y));
            }else if (n % xRemain == 0) {
                System.out.print(n/xRemain + " " + 0);
            }else if (n % y == 0) {
                System.out.print(0 + " " + n/y);
            }
            else {
                System.out.print(-1);
            }
        }
    }
}

// </Ctrl+Z>
