import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String num = scanner.nextLine();
            String[] data = new String[Integer.parseInt(num)];

            for (int i = 0; i < Integer.parseInt(num); i++) {
                data[i] = toCamelCase(scanner.nextLine());
            }

            for (String item: data) {
                System.out.println(item);
            }
        }
    }

    static String toCamelCase(String s){
        String[] parts = s.split(" ");
        String camelCaseString = "";
        for (String part : parts){
            camelCaseString = camelCaseString + toProperCase(part) + " ";
        }
        return camelCaseString;
    }

    static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
    }
}

// </Ctrl+Z>
