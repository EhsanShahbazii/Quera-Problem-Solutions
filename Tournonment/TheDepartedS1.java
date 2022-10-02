import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] data = new String[5];
            ArrayList<Integer> numbers = new ArrayList<Integer>();

            for (int i = 0; i < 5; i++) {
                data[i] = scanner.next();
                if (data[i].contains("FBI"))
                    numbers.add(i+1);
            }
            if (numbers.isEmpty()) {
                System.out.print("HE GOT AWAY!");
            }else {
                for (int temp: numbers) {
                    System.out.print(temp + " ");
                }
            }
        }
    }
}

// <Ctrl+Z>
