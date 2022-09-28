import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> data = new ArrayList<String>() {
            {
                add("shanbe");
                add("1shanbe");
                add("2shanbe");
                add("3shanbe");
                add("4shanbe");
                add("5shanbe");
                add("jome");
            }
        };

        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            data.remove(scanner.next());
        }

        int b = scanner.nextInt();
        for (int i = 0; i < b; i++) {
            data.remove(scanner.next());
        }

        int c = scanner.nextInt();
        for (int i = 0; i < c; i++) {
            data.remove(scanner.next());
        }

        System.out.print(data.size());
    }
}

// <Ctrl+Z>
