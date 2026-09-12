class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if (nums.length <= 1) {
            List<Integer> ans = new ArrayList<>();

            for (int num : nums) {
                ans.add(num);
            }
            return ans;
        }
        ArrayList<Integer>list= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key=entry.getKey();
            int value= entry.getValue();
            if(value>nums.length/3) list.add(key);
        }
        return list;
    }
}