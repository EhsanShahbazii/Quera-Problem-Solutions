import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String number = scanner.nextLine();

            System.out.println("saal:" + number.charAt(0) + number.charAt(1));
            System.out.println("maah:" + number.charAt(2) + number.charAt(3));

        }
    }
}

// </Ctrl+Z>
