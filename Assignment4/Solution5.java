class Solution5{
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        long mid;
        long answer = 0;
        
        while (start <= end) {
            mid = start + (end - start) / 2;
            
            if ((mid * (mid + 1)) / 2 <= n) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return (int) answer;
    }
}
