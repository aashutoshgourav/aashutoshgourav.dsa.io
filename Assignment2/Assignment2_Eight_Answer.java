import java.util.Arrays;

public class Assignment2_Eight_Answer {
    public int minimumScore(int[] nums, int k) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        if (maxVal - minVal <= 2 * k) {
            return 0;
        }

        int midpoint = (maxVal + minVal) / 2;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= midpoint - k) {
                nums[i] = midpoint - k;
            } else if (nums[i] >= midpoint + k) {
                nums[i] = midpoint + k;
            }
        }

        minVal = Arrays.stream(nums).min().getAsInt();
        maxVal = Arrays.stream(nums).max().getAsInt();

        return maxVal - minVal;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;

        Assignment2_Eight_Answer minimumScore = new Assignment2_Eight_Answer();
        int minScore = minimumScore.minimumScore(nums, k);

        System.out.println(minScore);
    }
}
