class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        
        // Build the frequency map
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Loop through the STRING, not the map, to guarantee first occurrence
        for(int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i; // Return the current index
            }
        }
        
        return -1;
    }
}