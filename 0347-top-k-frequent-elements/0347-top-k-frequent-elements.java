class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Map the frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // 2. Create a list from the entries
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        // 3. Sort the list based on frequency (descending)
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        // 4. Extract the top K keys into an array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}