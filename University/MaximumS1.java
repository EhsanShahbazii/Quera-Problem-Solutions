import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();

        int numbers[] = new int[Integer.parseInt(n)];
        String myStr = input.nextLine();
        int cut, element, index=0;

        if (n.equals("1")) {
            System.out.print(myStr);
        }else {
            while (true){
                cut = myStr.indexOf(" ");
                element = Integer.parseInt(myStr.substring(0, cut));
                numbers[index] = element;
                myStr = myStr.substring(cut+1);
                index++;
                if(!myStr.contains(" ")){
                    numbers[index] = Integer.parseInt(myStr);
                    break;
                }
            }

            Arrays.sort(numbers);

            System.out.print(numbers[numbers.length-1]);
        }
    }
}

// </Ctrl+Z>
