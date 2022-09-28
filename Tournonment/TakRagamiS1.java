import java.util.Scanner;

public class Main {

    public static  int result = 0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          String number = scanner.nextLine();
          boolean flag = true;

          result = data(number);

          while(flag) {
              if (result >= 10) {
                  result = data(Integer.toString(result));
              }if (result < 10) {
                  System.out.print(result);
                  flag = false;
              }
          }
        }
    }

    public static int data(String string) {
        result = 0;
        String[] array = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = String.valueOf(string.charAt(i));
        }
        for (int i = 0; i < string.length(); i++) {
            result += Integer.parseInt(array[i]);
        }
        return result;
    }
}

// <Ctrl+Z>
