class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0, r=0;
        int maxlen=0;
        int []arr=new int[128];
        while(r<n){
            l=Math.max(arr[s.charAt(r)],l);
            maxlen=Math.max(maxlen,r-l+1);
            arr[s.charAt(r)]=r+1;
            r++;
        }
        
        return maxlen;
    }
}