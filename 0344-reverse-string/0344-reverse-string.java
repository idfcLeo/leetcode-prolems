class Solution {
    public void reverseString(char[] s) {
        int m = s.length-1;
        int n=0;
        while(m>n){
            char t=s[m];
            s[m]=s[n];
            s[n]=t;
            m--;
            n++;
        }        
    }
}