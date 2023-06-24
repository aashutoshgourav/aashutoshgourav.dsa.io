class MoveZeroes {
    public void MoveZeroes(int[] numbers) {
        int nonZeroIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[nonZeroIndex] = numbers[i];
                nonZeroIndex++;
            }
        }
        while (nonZeroIndex < numbers.length) {
            numbers[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void MoveZeroes(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeroes solution = new MoveZeroes();
        solution.MoveZeroes(nums);
	System.out.print("[");
        for (int num=0;num<nums.length-2;num++) {
            System.out.print(nums[num] + " ");
        }
	System.out.print(nums[nums.length-1]+"]");
    }
}
