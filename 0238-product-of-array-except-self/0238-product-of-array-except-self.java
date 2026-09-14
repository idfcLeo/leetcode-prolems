class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Step 1: Calculate left products
        // result[i] will store the product of all elements to the left of nums[i]
        result[0] = 1; 
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // Step 2: Calculate right products and multiply with left products
        // We use a single variable 'right' to keep track of the product to the right
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * right; // Multiply left product by right product
            right = right * nums[i];       // Update right product for the next iteration
        }
        
        return result;
    }
}