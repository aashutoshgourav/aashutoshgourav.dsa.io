class Solution6{
    public int[] findOriginalArray(int[] changed) {
        if (changed == null || changed.length % 2 == 1) return new int[] {};
        int[] count = new int[100001], res = new int[changed.length / 2];
        int idx = 0;
        for (int x : changed)
            count[x]++;
        for (int i = 100000; i >= 1; i--) {
            if (i % 2 == 1) continue;
            if (count[i] != 0 && count[i/ 2] != 0) {
                int times = Math.min(count[i], count[i/2]);
                for (int j = 0; j < times; j++) {
                    res[idx++] = i / 2;
                    count[i/2]--;
                    if (idx >= res.length) return res;
                }
            }
        }
        
        int availableZeros = count[0] / 2;
        for (int j = 0; j < availableZeros; j++) {
            res[idx++] = 0;
            if (idx >= res.length) return res;
        }
        return new int[] {};
    }
}