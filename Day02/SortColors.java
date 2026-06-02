public class SortColors 
{
    public void sortColors(int[] nums)
    {
        int n = nums.length;
        int low, mid, high;
        low = 0;
        mid = 0;
        high = n-1;
        
        //low = boundary for 0s, mid = current, high = boundary for 2s
        while(mid <= high)
        {
            //if 0 swap with low and move both forward
            if(nums[mid] == 0)
            {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            //if 1 just move mid forward
            else if(nums[mid] == 1)
            {
                mid++;
            }
            //if 2 swap with high and move high back
            else
            {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

