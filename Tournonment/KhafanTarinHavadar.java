import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        String[] a0 = input.split("1");
        String[] a1 = input.split("0");

        int max0 = 0;
        for (int i = 0; i < a0.length; i++) {
            if (a0[i].length() > max0) {
                max0 = a0[i].length();
            }
        }

        System.out.println(max0);
    }
}
