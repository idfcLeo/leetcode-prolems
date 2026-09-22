class Solution {
    public int secondHighest(String s) {
        char arr[]=s.toCharArray();
        HashSet<Integer> list=new HashSet<>();
        for(char ch: arr){
            if(Character.isDigit(ch)){
                list.add(Integer.parseInt(Character.toString(ch)));
            }
        }
        int max=0;
        for(int i: list){
            max=Math.max(max,i);
        }
        int max2=0;
        for(int i: list){
            if(max==i)continue;
            max2=Math.max(max2,i);
        }
        if(list.size()<=1)return -1;
        return max2;
    }
}