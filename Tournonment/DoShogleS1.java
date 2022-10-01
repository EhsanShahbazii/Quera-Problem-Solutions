import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String day = scanner.next();

            switch(day) {
                case "shanbe":
                    System.out.print("perspolis");
                    break;
                case "doshanbe":
                    System.out.print("perspolis");
                    break;
                case "chaharshanbe":
                    System.out.print("perspolis");
                    break;
                case "jome":
                    System.out.print("tatil");
                    break;
                default:
                    System.out.print("bahman");
            }
        }
    }
}

// </Ctrl+Z>
