class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        int n= arr.length-1;
        return arr[n].length();
    }
}