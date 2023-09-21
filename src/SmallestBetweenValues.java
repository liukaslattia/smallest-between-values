import java.util.Arrays;

public class SmallestBetweenValues {

    public static int findSmallestBetweenValues(int[] numbers) {
        Arrays.sort(numbers); // Sort the array in ascending order

        int smallest = Integer.MAX_VALUE;

        // Iterate through the sorted array and calculate the smallest gap
        for (int i = 0; i < numbers.length - 1; i++) {
            int gap = numbers[i + 1] - numbers[i] - 1;
            if (gap > 0 && gap < smallest) {
                smallest = gap;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int[] inputArray = {1,4,10};
        int smallestGap = findSmallestBetweenValues(inputArray);

        System.out.println("Smallest value between any pair of array elements: " + smallestGap);
    }
}
