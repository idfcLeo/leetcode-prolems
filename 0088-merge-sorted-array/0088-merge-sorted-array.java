class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // Pointer for valid elements in nums1
        int j = n - 1;     // Pointer for nums2
        int k = m + n - 1; // Pointer for the insertion position at the back of nums1
        
        // Compare elements from the back and move the larger one
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        // If there are remaining elements in nums2, copy them over
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
