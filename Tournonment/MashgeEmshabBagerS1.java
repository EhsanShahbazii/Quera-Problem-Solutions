import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          String string = scanner.nextLine();

          String[] numbers= string.split(" ");
          if (Integer.parseInt(numbers[0]) == 0 || Integer.parseInt(numbers[1]) == 0 || Integer.parseInt(numbers[2]) == 0)
              System.out.print("No");
          else if (Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[2]) == 180)
              System.out.print("Yes");
          else
              System.out.print("No");
        }
    }
}

// <Ctrl+Z>
