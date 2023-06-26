import java.util.HashSet;
import java.util.Set;

public class Assignment2_Second_Answer {
    public static int maxCandies(int[] candyType) {
        Set<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        return Math.min(uniqueCandies.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        System.out.println(maxCandies(candyType));
    }
}
