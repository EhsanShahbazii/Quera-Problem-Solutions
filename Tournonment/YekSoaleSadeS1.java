import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          byte count = scanner.nextByte();

          for (byte i = 0; i < count; i++) {
              System.out.println("man khoshghlab hastam");
          }
        }
    }
}

// </Ctrl+Z>
