class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < m + n; i++) {
            if ((m + i) < m + n) {
                nums1[m + i] = nums2[i];
            }
        }

        Arrays.sort(nums1);
    }
}
