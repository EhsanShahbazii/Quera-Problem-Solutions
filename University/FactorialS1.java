import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.print(fact(num));
    }

    public static long fact(int num) {
        if (num == 0)
            return 1;
        else
            return num * fact(num - 1);
    }
}

// </Ctrl+Z>
