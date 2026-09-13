class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          HashMap<String, List<String>>map= new HashMap<>();
          for(String s: strs){
            char[]arr=s.toCharArray();
            Arrays.sort(arr);
            String g=Arrays.toString(arr);
            if(!map.containsKey(g)){
                map.put(g, new ArrayList<>());
            }
            map.get(g).add(s);
          }
          return new ArrayList<>(map.values());
    }
}