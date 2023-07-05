class Solution1{
    public int minimumDeleteSum(String s1, String s2) {
                return computeCost(s1, s2, s1.length()-1, s2.length()-1);
    }
        private int computeCost(String s1, String s2, int i, int j) {
        if (i < 0) {
            int deleteCost = 0;
            for (int pointer = 0; pointer <= j; pointer++) {
                deleteCost += s2.charAt(pointer);
            }
            return deleteCost;
        }
        if (j < 0) {
            int deleteCost = 0;
            for (int pointer = 0; pointer <= i; pointer++) {
                deleteCost += s1.charAt(pointer);
            }
            return deleteCost;
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            return computeCost(s1, s2, i-1, j-1);
        } else {
            return Math.min(
                s1.charAt(i) + computeCost(s1, s2, i-1, j),
                Math.min(
                    s2.charAt(j) + computeCost(s1, s2, i, j-1),
                    s1.charAt(i) + s2.charAt(j) + computeCost(s1, s2, i-1, j-1)
                )
            );
        }
    }
}