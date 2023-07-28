import java.util.Scanner;
import java.util.Random;

public class mainEC {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int[] dataPoints = new int[100];

        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1; 
        }

        for(int i : dataPoints) {
            System.out.print(i + " | ");
        }

        System.out.println("The sum of the array dataPoints is: " + sum(dataPoints) + " and the average of the array is: " + getAverage(dataPoints));

        int userNum = SafeInput.getRangedInt(in, "Enter a number between 1 and 100: ", 1, 100);

        System.out.println("The same number you entered showed up " + occuranceScan(dataPoints, userNum) + " times.");

        int num = SafeInput.getRangedInt(in, "Enter a number between 1 and 100: ", 1, 100);

        contains(dataPoints, num);

        System.out.println("The minimum value of the array dataPoints is " + min(dataPoints) + " and the maximum value of the array is " + max(dataPoints));

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static int min(int values[]) {
        int min = values[0];

        for(int i = 0; i < values.length; i++) {
            if(values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int values[]) {
        int max = values[0];

        for(int i = 0; i < values.length; i++) {
            if(values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static int occuranceScan(int values[], int target) {
        int counter = 0;

        for(int i = 0; i < values.length; i++) {
            if(values[i] == target) {
                counter += 1;
            }
        }
        return counter;
    }

    public static int sum(int values[]) {
        int sum = 0;

        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static boolean contains(int values[], int target) {
        boolean YN = false;
        for(int i = 0; i < values.length; i++) {
            if(values[i] == target) {
                System.out.println("The value " + target + " showed up at " + i);
                YN = true;
                break;
            }
        }
        return YN;
    }

    public static double getAverage(int values[]) {
        int sum = sum(values);
        int average = 0;
        
        average = sum / values.length;
        return average;
    }
}
