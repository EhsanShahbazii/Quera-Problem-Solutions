import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          int count = scanner.nextInt();

            if (count % 2 == 0)
                System.out.print("Bala Barare");
            else
                System.out.print("Payin Barare");
        }
    }
}

// <Ctrl+Z>
