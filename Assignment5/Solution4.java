class Solution4{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n=nums1.length,m=nums2.length;

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                if(a.size()==0 || nums1[i]!=a.get(a.size()-1))
                    a.add(nums1[i]);
                    i++;
            }
            else if(nums1[i]==nums2[j]){
                int aa=nums1[i];
                while(i<n && nums1[i]==aa)
                    i++;
                while(j<m && nums2[j]==aa)
                    j++;
            }
            else{
                if(b.size()==0 || nums2[j]!=b.get(b.size()-1))
                b.add(nums2[j]);
                j++;
            }

        }
        while(i<n){
            if(a.size()==0 || nums1[i]!=a.get(a.size()-1))
                    a.add(nums1[i]);
                    i++;
        }
        while(j<m){
                if(b.size()==0 || nums2[j]!=b.get(b.size()-1))
                b.add(nums2[j]);
                j++;
            }
        ans.add(a);
        ans.add(b);
        return ans;
    }
}
