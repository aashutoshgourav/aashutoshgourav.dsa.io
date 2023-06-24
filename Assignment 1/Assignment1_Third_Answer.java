public class Main{
    public static int findInsertPosition(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};
        int target = 5;
        int index = findInsertPosition(numbers, target);
        System.out.println(index);
    }
}
