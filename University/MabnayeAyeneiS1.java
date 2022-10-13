import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String a = scanner.next();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            String result = Integer.toString(Integer.parseInt(a, b), c);

            if (reverse(result).equals(result)) {
                System.out.print("YES");
            }else {
                System.out.print("NO");
            }
        }
    }

    public static String reverse(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            result = result.concat(String.valueOf(input.charAt(input.length() - 1 - i)));
        }
        return result;
    }
}
