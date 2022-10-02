import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long deg = scanner.nextLong();

        boolean flag = false;
        while (deg != 3 && !flag) {
            if (deg % 2 == 0)
                deg /= 2;
            else if (deg != 1)
                deg = 3*deg + 3;
            if (deg == 1) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}   

// </Ctrl+Z>
