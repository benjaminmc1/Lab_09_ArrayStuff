import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        // Part 1

        // 1a

        int[] dataPoints = new int[100];

        // 1b

        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1; 
            
        }

        // 1c

        for(int i : dataPoints) {
            System.out.print(i + " | ");
        }

        // 1d

        int sum = 0;
        int average = 0;

        for(int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        average = sum / dataPoints.length;
        System.out.println("The sum of the array dataPoints is: " + sum + " and the average of the array is: " + average);

        // Part 2

        // 2a

        int userNum = SafeInput.getRangedInt(in, "Enter a number between 1 and 100: ", 1, 100);

        // 2b

        int counter = 0;
        
        for(int i = 0; i < dataPoints.length; i++) {
            if(userNum == dataPoints[i]) {
                counter = counter + 1;
            }
        }

        System.out.println("The same number you entered showed up " + counter + " times.");

        int num = SafeInput.getRangedInt(in, "Enter a number between 1 and 100: ", 1, 100);

        for(int i = 0; i < dataPoints.length; i++) {
            if(userNum == dataPoints[i]) {
                System.out.println("The value " + num + " was found at array index " + i);
                break;
            }
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int i = 0; i < dataPoints.length; i++) {
            if(dataPoints[i] > max) {
                max = dataPoints[i];
            } else if(dataPoints[i] < min) {
                min = dataPoints[i];
            }
        }

        System.out.println("The minimum value of the array dataPoints is " + min + " and the maximum value of the array is " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[]) {
        int sum = 0;
        double average = 0;

        for(int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }

        average = sum / values.length;
        return average;
    }
}
