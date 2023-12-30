import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();
        StringBuilder fin = new StringBuilder();

        for (int i = 0; i < row; i++) {
            StringBuilder temp1 = new StringBuilder();
            StringBuilder temp2 = new StringBuilder();
            for (int j = 0; j < column; j++) {
                temp1.append(" _");
                temp2.append("| ");
            }
            fin = temp1;
            temp2.append("| ");
            System.out.println(temp1);
            System.out.println(temp2);
        }
        System.out.println(fin);
    }
}
