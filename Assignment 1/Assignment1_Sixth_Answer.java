import java.util.HashSet;

class Duplicate {
    public static boolean containsDuplicate(int[] numbers) {
        HashSet<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numberSet.contains(numbers[i])) {
                return true;
            }
            numberSet.add(numbers[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        boolean hasDuplicates = containsDuplicate(input);
        System.out.println("Array contains duplicates: " + hasDuplicates);
    }
}
