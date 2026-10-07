class Solution {
    public boolean isAnagram(String s, String t) {
        int l=s.length();
        int m=t.length();
        if (l!=m)return false;
        char arr[]=s.toCharArray();
        char brr[]=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        return Arrays.equals(arr,brr);
    }
}