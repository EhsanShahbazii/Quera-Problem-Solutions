import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x == 7 && y == 7) {
            System.out.println(1);
            System.out.println("2 2");
        }else {
            System.out.println(1);
            System.out.print("7 7");
        }
    }
}

// </Ctrl+Z>
