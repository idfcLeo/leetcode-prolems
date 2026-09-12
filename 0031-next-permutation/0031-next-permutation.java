class Solution {
    public void nextPermutation(int[] nums) {
        int ptr=nums.length-1;
        int n=nums.length;
        while(ptr>0){
            if(nums[ptr]>nums[ptr-1]){
                break;
            }
            ptr--;
        }
        if(ptr==0){reverse(nums,0,nums.length-1);return;}
        int k=0;    
        for(int i=n-1;i>=ptr;i--){
            if(nums[ptr-1]<nums[i]){
                k=i;
                break;
            }
        }
        
        int temp=nums[k];
        nums[k]=nums[ptr-1];
        nums[ptr-1]=temp;
        reverse(nums,ptr,n-1);       
    }
    public void reverse(int[]nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}