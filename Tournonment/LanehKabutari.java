import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pigeon = scanner.nextInt();
        int nest = scanner.nextInt();

        if (pigeon <= nest) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
