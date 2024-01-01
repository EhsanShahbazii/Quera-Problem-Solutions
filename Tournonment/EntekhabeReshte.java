import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("EAST")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
