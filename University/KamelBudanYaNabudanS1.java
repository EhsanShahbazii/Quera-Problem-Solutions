import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int number = scanner.nextInt();
            int result = 1;

            for (int i = 2; i <= number/2; i++) {
                if( number % i == 0)
                    result += i;
            }
            if (result == number)
                System.out.print("YES");
            else
                System.out.print("NO");
        }
    }
}

// </Ctrl+Z>
