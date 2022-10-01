import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int index_L = 0, index_R = 0;
            String leftPart = "1", rightPart = "1", temp = "";

            index_L = scanner.nextInt();
            index_R = scanner.nextInt();

            for (int i = 0; leftPart.length() < index_R; i++) {

                if(i == 0) {
                    leftPart = "10";
                    rightPart = "01";
                }

                temp = rightPart.concat(leftPart);
                leftPart = leftPart.concat(rightPart);
                rightPart = temp;

            }
            System.out.println(leftPart.substring(index_L - 1,index_R));
        }
    }
}

// </Ctrl+Z>
