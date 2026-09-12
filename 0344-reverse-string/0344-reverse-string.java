class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        ArrayList<Character>list= new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(s[i]);
        }
        Collections.reverse(list);
        for(int i=0;i<s.length;i++){
            s[i]=list.get(i);
        }        
    }
}