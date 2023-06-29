class Solution8{
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int currentIndex = 0;
        int arrayIndex = 0;

        for (int i = 0; i < n; i++) {
            result[currentIndex] = nums[arrayIndex];
            result[currentIndex + 1] = nums[arrayIndex + n];
            currentIndex += 2;
            arrayIndex++;
        }

        return result;
    }
}