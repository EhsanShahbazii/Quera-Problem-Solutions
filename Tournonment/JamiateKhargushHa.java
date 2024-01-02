import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rabbit = scanner.nextInt();
        int eat = scanner.nextInt();
        int year = scanner.nextInt();

        for (int i = 0; i < year; i++) {
            rabbit *= 2;
            rabbit -= eat;
        }
        System.out.println(rabbit);
    }
}
