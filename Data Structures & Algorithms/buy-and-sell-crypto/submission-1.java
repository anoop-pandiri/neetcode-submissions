class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i : prices){
            if(minPrice>i)
                minPrice = i;
            if(maxProfit < i-minPrice)
                maxProfit = i-minPrice;
        }
        return maxProfit;
    }
}
