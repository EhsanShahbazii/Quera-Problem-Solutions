import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] index = new int[5];
            int a = 0;

            for (int i = 1; i <= 5; i++) {
                String input = scanner.nextLine();
                if (input.contains("MOLANA") || input.contains("HAFEZ")) {
                    index[a] = i;
                    a++;
                }
            }

            String result = "";
            if (a == 0) {
                System.out.print("NOT FOUND!");
            }else {
                for (int num: index) {
                    if (num != 0)
                        result = result.concat(" " + num);
                }
                System.out.print(result.substring(1));
            }
        }
    }
}

// </Ctrl+Z>
