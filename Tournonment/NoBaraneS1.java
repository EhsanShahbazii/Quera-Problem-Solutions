import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.nextLine();
            String[] waterMelon = input.split(" ");
            int index = 0;

            for (String item: waterMelon) {
                if (Integer.parseInt(item) >= 80)
                    index++;
            }

            if (index >= 3)
                System.out.print("Mamma mia!");
            else if (index == 2 || index == 1)
                System.out.print("Mamma mia!!");
            else
                System.out.print("Mamma mia!!!");
        }
    }
}

// </Ctrl+Z>
