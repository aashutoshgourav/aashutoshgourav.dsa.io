class Solution7{
    public int maxCount(int m, int n, int[][] ops) {
        int length = ops.length;
        if (length == 0) {
            return m * n;
        }
        int[] result = { ops[0][0], ops[0][1] };
        for (int i = 1; i < length; i++) {
            result[0] = Math.min(result[0], ops[i][0]);
            result[1] = Math.min(result[1], ops[i][1]);
        }
        return result[0] * result[1];
    }
}
