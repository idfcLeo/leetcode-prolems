class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int max= 0;
        int min= Integer.MAX_VALUE;
        
        for(int i : prices){
            min = Math.min(min,i);
            int profit = i-min;
            max=Math.max(profit,max);
        }
        return max;        
    }
}