class Solution4{
    public int searchInsert(int[] nums, int target) {
     int low =0;
     int high = nums.length-1;
     int insert = low+(high-low)/2; 
     while(low <= high)
     {
        if(target == nums[insert])
           return insert;
        else if(target<nums[insert])
           high = insert-1;
        else
           low = insert+1;   
        
        insert = low+(high-low)/2; 
     }   
     return insert;
    }
}