public class BuyAndsellStock 
{
    public int maxProfit(int[] prices)
    {
        int i;
        int n = prices.length;
        int minPrice = prices[0];
        int maxProfit = 0;

        //go through each price and track min price seen so far
        for(i=0; i<n; i++)
        {
            //update min price if we find a lower one
            if(prices[i] < minPrice)
            {
                minPrice = prices[i];
            }
            //check if selling today gives better profit
            else if(prices[i] - minPrice > maxProfit)
            {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

}
