import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] data = new String[4][2];

        for (int i = 0; i < 4; i++) {
            data[i][0] = scanner.next();
            data[i][1] = scanner.next();
        }

        ArrayList<String> finaldata = new ArrayList<>();
        ArrayList<String> finaldatas = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (!data[i][1].equals("U")) {
                finaldata.add(data[i][1]);
                finaldatas.add(data[i][0]);
            }
        }

        if (finaldata.get(0).equals(finaldata.get(1)) && finaldata.get(1).equals(finaldata.get(2))) {
            System.out.print(finaldatas.get(1));
        } else if (finaldata.get(0).equals(finaldata.get(1)) && !finaldata.get(1).equals(finaldata.get(2))) {
            System.out.print(finaldatas.get(0));
        } else if (finaldata.get(0).equals(finaldata.get(2)) && !finaldata.get(1).equals(finaldata.get(2))) {
            System.out.print(finaldatas.get(0));
        } else if (finaldata.get(1).equals(finaldata.get(2)) && !finaldata.get(0).equals(finaldata.get(1))) {
            System.out.print(finaldatas.get(1));
        }
    }
}

// </Ctrl+Z>
