class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Count the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int duplicate = 0, missing = 0;
        
        // Check numbers from 1 to n
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    duplicate = i; // Number appears twice
                }
            } else {
                missing = i; // Number is not in the map
            }
        }
        
        return new int[]{duplicate, missing};
    }
}