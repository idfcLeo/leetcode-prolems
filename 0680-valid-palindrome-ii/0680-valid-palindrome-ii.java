class Solution {
    public boolean validPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return  isvalid(s,left+1,right)|| isvalid(s,left,right-1);
            } 
                left++;
                right--;  
        }
        return true;
    }
    static boolean isvalid(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}