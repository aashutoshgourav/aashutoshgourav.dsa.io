class Solution1{
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if(original.length!= m*n)
        return new int[0][0];
            
        
        int[][] ans = new int[m][n];
        for (int index = 0; index < original.length; index++) {
            int no_row=index/n;
            int no_col=index%n;
            ans[no_row][no_col]=original[index];
        }
        return ans;
    }
}