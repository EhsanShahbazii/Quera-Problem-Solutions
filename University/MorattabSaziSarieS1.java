import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.nextLine();

            String[] data = input.split(" ");

            for (int i = 0; i < data.length; i++) {
                for (int j = i + 1; j < data.length; j++) {
                    String tmp;
                    if (Integer.parseInt(data[i]) > Integer.parseInt(data[j])) {
                        tmp = data[i];
                        data[i] = data[j];
                        data[j] = tmp;
                    }
                }
            }
            for (String item: data) {
                System.out.print(item + " ");
            }
        }
    }
}
