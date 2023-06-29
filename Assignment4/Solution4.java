class Solution4{
    public int arrayPairSum(int[] nums) {
        return result(nums);
    }
    public int result(int[] nums){
        Arrays.sort(nums);
        int r=0;
        for(int i=0;i<nums.length;i+=2){
            r+=nums[i];
        }
        return r;
    }
}