class Solution7{
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        
        if (nums[l] <= nums[r]) {
            return nums[0];
        }
        
        while (r >= l) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= nums[0]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return nums[l];
    }
}