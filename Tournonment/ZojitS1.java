import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n == 3 || n == 5 || n == 7 || n == 11 || n == 13 || n == 17 || n == 19 || n == 23 || n == 29 || n == 31 ||
                    n == 37 || n == 41 || n == 43 || n == 47) {
                System.out.print("zoj");
            }else {
                System.out.print("fard");
            }
        }
    }
}

// </Ctrl+Z>
