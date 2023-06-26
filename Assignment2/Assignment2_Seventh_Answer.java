class Assignement2_Seventh_Answer {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 0) {
            return true;
        }
        
        int i = 0, j = 1;
        int inc = 0, dec = 0;
        
        while (i <= nums.length - 2 && j <= nums.length - 1) {
            if (nums[i] < nums[j]) {
                inc++;
                i++;
                j++;
            } else if (nums[i] > nums[j]) {
                dec++;
                i++;
                j++;
            } else {
                i++;
                j++;
            }
            
            if (inc > 0 && dec > 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Assignement2_Seventh_Answer assignement2_Seventh_Answer = new Assignement2_Seventh_Answer();
        
        int[] nums = {1, 2, 2, 3};
        boolean isMonotonic = assignement2_Seventh_Answer.isMonotonic(nums);
        System.out.println(isMonotonic);
    }
}
