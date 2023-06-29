class Solution6{
    public int[] sortedSquares(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int length = nums.length - 1;

        int[] result = new int[length + 1];

        while (leftPointer <= rightPointer) {
            int a = (int) Math.pow(nums[leftPointer], 2);
            int b = (int) Math.pow(nums[rightPointer], 2);

            if (a > b) {
                result[length] = a;
                leftPointer++;
            } else {
                result[length] = b;
                rightPointer--;
            }

            length--;
        }

        return result;
    }
}
