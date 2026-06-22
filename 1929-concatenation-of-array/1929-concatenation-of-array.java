class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int con[]= new int [n+n];
        System.arraycopy(nums,0,con,0,n);
        System.arraycopy(nums,0,con,n,n);
        return con;
    }
}