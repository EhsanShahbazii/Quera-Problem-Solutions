import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int mouseX = scanner.nextInt();
            int homeX = scanner.nextInt();

            if (mouseX == homeX) {
                System.out.print("Saal Noo Mobarak!");
            }else {
                if (mouseX > homeX) {
                    for (int i = 0; i < mouseX-homeX; i++) {
                        System.out.print("L");
                    }
                }else {
                    for (int i = 0; i < homeX-mouseX; i++) {
                        System.out.print("R");
                    }
                }
            }
        }
    }
}

// </Ctrl+Z>
