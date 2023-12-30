import java.util.Scanner;
public class SheshSang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "space":
                System.out.println("blue");
                break;
            case "mind":
                System.out.println("yellow");
                break;
            case "reality":
                System.out.println("red");
                break;
            case "power":
                System.out.println("purple");
                break;
            case "time":
                System.out.println("green");
                break;
            case "soul":
                System.out.println("orange");
                break;
        }
    }
}