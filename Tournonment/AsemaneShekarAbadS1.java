import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int row = scanner.nextInt();
            int column = scanner.nextInt();

            String[][] data = new String[row][column];
            int count = 0;

            for(int i = 0; i < row; i++) {
                String input = scanner.next();
                for(int j = 0; j < column; j++) {
                    data[i][j] = String.valueOf(input.charAt(j));
                    if (data[i][j].equals("*"))
                        count++;
                }
            }
            System.out.print(count);
        }
    }
}

// </Ctrl+Z>
