class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        // Stores the last seen position + 1 of each character
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // If their last seen positions don't match, it's not isomorphic
            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            // Record the current position (using i + 1 to avoid default 0 conflict)
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }
}
