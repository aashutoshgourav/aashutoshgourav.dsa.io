import java.util.Arrays;

class Solution {
    public int Assignment2_Third_Answer(int[] nums) {
        Arrays.sort(nums);

        int len = nums.length;
        int ans = 0;
        int countTemp = 0;
        int valTemp = 0;

        for (int i = 0; i < len; i++) {
            int count = 1;

            while (i < len - 1 && nums[i] == nums[i + 1]) {
                i++;
                count++;
            }

            if (i > 0 && nums[i] - valTemp <= 1) {
                ans = Math.max(ans, count + countTemp);
            }
            countTemp = count;
            valTemp = nums[i];
        }

        return countTemp == len ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        Solution solution = new Solution();
        int result = solution.Assignment2_Third_Answer(nums);
        System.out.println(result);
    }
}
