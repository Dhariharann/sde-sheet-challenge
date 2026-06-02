public class KadanesAlgo 
{
    public int maxSubArray(int[] nums)
    {
        int i;
        int n = nums.length;
        int currentSum = nums[0];
        int maxSum = nums[0];

        //kadanes algorithm -- keep extending or restart subarray
        for(i=1; i<n; i++)
        {
            //if current sum -ve -- restart from current element
            if(currentSum < 0)
            {
                currentSum = nums[i];
            }
            else
            {
                currentSum = currentSum + nums[i];
            }
            //update max if a better sum will be achieved
            if(currentSum > maxSum)
            {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}