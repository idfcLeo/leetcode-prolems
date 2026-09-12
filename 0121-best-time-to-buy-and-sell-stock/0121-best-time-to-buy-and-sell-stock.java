class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i:prices){
            min=Math.min(min,i);
            int price=i-min;
            max=Math.max(max,price);
        }
        return max;
    }
}