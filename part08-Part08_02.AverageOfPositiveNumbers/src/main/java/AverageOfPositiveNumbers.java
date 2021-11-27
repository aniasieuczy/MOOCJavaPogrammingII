
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                sum = number + sum;
                count++;
                average = (double)sum / count;
            }
        }


        if (average > 0) {
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
