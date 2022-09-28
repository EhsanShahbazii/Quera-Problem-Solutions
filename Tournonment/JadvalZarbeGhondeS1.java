import java.util.Scanner;

public class Main {

    public static  int result = 0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          int row = scanner.nextInt();

          for (int i = 1; i <= row; i++) {
              for (int j = 1; j <= row; j++) {
                  System.out.print(j*i + " ");
              }
              System.out.println("");
          }
        }
    }
}

// <Ctrl+Z>
