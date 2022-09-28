import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int k = scanner.nextInt();

            int result = k*(k+1)/2;

            System.out.print(result);
        }
    }
}

// </Ctrl+Z>
