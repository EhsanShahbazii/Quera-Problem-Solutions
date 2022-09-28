import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          int temperature = scanner.nextInt();

          if (temperature > 100)
              System.out.print("Steam");
          else if (temperature < 0)
              System.out.print("Ice");
          else
              System.out.print("Water");
        }
    }
}

// <Ctrl+Z>
