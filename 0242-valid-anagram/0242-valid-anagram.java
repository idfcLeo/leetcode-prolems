class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m != n) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count characters for string s
        for (int i = 0; i < m; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);  
        }
        
        // Subtract counts using string t
        for (int i = 0; i < m; i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        
        // Check if all counts are zero
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}