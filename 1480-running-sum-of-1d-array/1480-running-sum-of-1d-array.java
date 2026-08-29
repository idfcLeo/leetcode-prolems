class Solution {
    public int[] runningSum(int[] nums) {
        int n= nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int val=nums[i];
            sum+=val;
            nums[i]=sum;
        }        
        return nums;
    }
}