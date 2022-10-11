import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int side = scanner.nextInt();

            for(int i = 1; i <= side; i++) {
                if (i == 1) {
                    print(side);
                    System.out.print("");
                }else if (i == side) {
                    print(side);
                }else {
                    printDeep(side);
                }
                System.out.println("");
            }
        }
    }

    public static void print(int side) {
        for (int i = 1; i <= side; i++) {
            System.out.print("*");
        }
    }

    public static void printDeep(int side) {
        for (int i = 1; i <= side; i++) {
            if (i == 1 || i == side) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
    }
}

// </Ctrl+Z>
