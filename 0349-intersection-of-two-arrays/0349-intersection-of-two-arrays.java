class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        // Add all elements from nums1 to the set
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        
        // Check nums2 against the set
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                // Remove the element from the set to avoid duplicates in the result
                set.remove(nums2[i]); 
            }
        }
        
        // Convert the ArrayList of Integer objects to a primitive int[] array
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}