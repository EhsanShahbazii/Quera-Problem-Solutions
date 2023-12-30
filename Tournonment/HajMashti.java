import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] data = input.split("");

        if (data[0].equals("Y")) {
            System.out.println("Haji");
        } else if (data[1].equals("Y")) {
            System.out.println("Karbalaee");
        } else if (data[2].equals("Y")){
            System.out.println("Mashti");
        } else {
            System.out.println("Agha");
        }
    }
}
