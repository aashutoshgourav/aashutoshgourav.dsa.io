import java.util.*;

class Main {
    public static Vector<Integer> findRepeatedNumbers(int[] arr) {

        int size = arr.length;

        long sum = 0;
        long sumOfSquares = 0;

        for (int x : arr) {
            sum += x;
            sumOfSquares += (long) x * x;
        }

        long expectedSum = (long) size * (size + 1) / 2;
        long expectedSumOfSquares = expectedSum * (2 * size + 1) / 3;

        int difference = (int) (expectedSum - sum);
        int addition = (int) ((expectedSumOfSquares - sumOfSquares) / difference);

        int repeatedNumber = (difference + addition) / 2;
        int missingNumber = repeatedNumber - difference;

        Vector<Integer> result = new Vector<>();
        result.add(missingNumber);
        result.add(repeatedNumber);
        return result;
    }

    // Driver Code
    public static void main(String[] args) {
        int[] array = { 1,2,2,4 };
        Vector<Integer> result = findRepeatedNumbers(array);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
