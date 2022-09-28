import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int count = scanner.nextInt();
            String[] data = {"sib", "sama", "sarina", "sanam", "sogol", "sana", "sara"};

            for (int i = 0; i < count; i++) {
                System.out.println(data[i]);
            }
        }
    }
}

// </Ctrl+Z>
