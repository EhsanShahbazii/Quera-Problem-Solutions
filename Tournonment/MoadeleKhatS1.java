import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a == 0 && b == 0) {
                System.out.println("infinite");
            }else if (a == 0) {
                System.out.println("invalid");
            }else {
                System.out.println("unique");
            }
        }
    }
}

// </Ctrl+Z>
