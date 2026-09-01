class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 1. Copy elements from nums2 into the end of nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        
        // 2. Sort nums1 directly
        Arrays.sort(nums1);
    }
}