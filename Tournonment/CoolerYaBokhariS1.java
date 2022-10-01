import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
           String n = scanner.nextLine();
           String input = scanner.nextLine();
           String[] spl = input.split(" ");

           for(int i = 0; i < Integer.parseInt(n); i++) {
            if (Integer.parseInt(spl[i]) > 15) {
                System.out.println("cooler");
            } else {
                System.out.println("heater");
            }
           }
        }
    }
}

// </Ctrl+Z>
