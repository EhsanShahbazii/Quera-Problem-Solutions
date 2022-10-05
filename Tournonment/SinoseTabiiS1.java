import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int a = scanner.nextInt();
            int i = 1;
            double d = (double) 1/a;

            while (true) {
                if (Math.sin(i) >= 0 && Math.sin(i) <= d) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
        }
    }
}

// </Ctrl+Z>
