import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.nextLine();
            String[] value = input.split(" ");

            for (int i = 0; i < Integer.parseInt(value[0]); i++) {
                System.out.print("copy of ");
            }
            System.out.print(value[1]);
        }
    }
}

// <Ctrl+Z>
