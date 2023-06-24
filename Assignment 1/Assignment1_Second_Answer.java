class RemoveAllOccurence{
    public int removeElement(int[] nums, int val) {
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=val){
                nums[left++]=nums[right];
            }
        }
        return left;
    }
    public static void main(String args[]){
        int[] nums={3,2,2,3};
        int val=3;
        RemoveAllOccurence in=new RemoveAllOccurence();
        System.out.print(in.removeElement(nums,val));
    }
}