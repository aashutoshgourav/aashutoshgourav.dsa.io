import java.util.HashMap;
import java.util.Map;
class Main{
    public static void main(String args[]){
        int nums[]={2,7,11,15};
        int target=9;
        int result[]=targetIndicies(nums,target);
            System.out.printf("[%d,%d]",result[0],result[1]);
    }
    public static int[] targetIndicies(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        int difference;
        for(int i=0;i<nums.length;i++){
            difference=target-nums[i];
            if(map.containsKey(difference)){
                return new int[] {map.get(difference),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}