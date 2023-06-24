class MergeSortedArrays {
    public void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < m) {
            merged[k++] = nums1[i++];
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        System.arraycopy(merged, 0, nums1, 0, m + n);
    }

    public static void main(String[] args) {
        MergeSortedArrays solution = new MergeSortedArrays();

        // Example usage
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;

        int[] nums2 = { 2, 5,6 };
        int n = 3;

        solution.mergeArrays(nums1, m, nums2, n);

        System.out.println("Merged Array:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
