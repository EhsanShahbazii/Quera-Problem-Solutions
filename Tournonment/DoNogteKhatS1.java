import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
                String content = scanner.nextLine();

                String[] array = content.split(" ");

                if (array[0].equals(array[2]))
                    System.out.print("Vertical");
                else if (array[1].equals(array[3]))
                    System.out.print("Horizontal");
                else
                    System.out.print("Try again");
        }
    }
}

// <Ctrl+Z>
