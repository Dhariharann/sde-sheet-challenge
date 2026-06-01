class NextPermutation 
{
    public void nextPermutation(int[] nums) 
    {
        int n = nums.length;
        int i, j;
        i = n-2;

        //find the first drop from the right side 
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        //find just bigger element from right and swap them
        if(i >= 0)
        {
            j = n-1;
            while(nums[j] <= nums[i])
            {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        //reverse everything after i
        int l = i+1;
        int r = n-1;
        while(l < r)
        {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}