import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String num1 = scanner.next();
            String num2 = scanner.next();
            String finals = "";

            int result = Integer.parseInt(num2) - Integer.parseInt(num1);
            if (result < 0)
                result *= -1;

            for (int i = 2; i <= result; i++) {
                if (result % i == 0)
                    finals = finals.concat(i + " ");
            }

            System.out.print(finals.substring(0, finals.length() - 1));
        }
    }

}
