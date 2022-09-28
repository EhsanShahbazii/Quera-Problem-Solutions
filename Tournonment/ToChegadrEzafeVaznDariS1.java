import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            double weight = scanner.nextDouble();
            double height = scanner.nextDouble();

            double bmi = weight/(height * height);

            System.out.format("%.2f", bmi);
            System.out.println(" ");
            if (bmi < 18.5)
                System.out.print("Underweight");
            else if (bmi >= 18.5 && bmi < 25)
                System.out.print("Normal");
            else if (bmi >= 25 && bmi < 30)
                System.out.print("Overweight");
            else
                System.out.print("Obese");
        }
    }
}

// </Ctrl+Z>
