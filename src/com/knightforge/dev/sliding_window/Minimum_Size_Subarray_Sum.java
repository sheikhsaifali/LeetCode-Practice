package com.knightforge.dev.sliding_window;

public class Minimum_Size_Subarray_Sum {
    /*
     * Input: target = 7, nums = [2,3,1,2,4,3]
     * Output: 2
     */
    public int minSubArrayLen(int target, int[] nums)
    {
        int sum = 0, high = 0, low = 0, result = Integer.MAX_VALUE, size = 0;
        while (high<nums.length)
        {
            sum = sum + nums[high];
            while (sum>=target)
            {
                size = high - low + 1;
                result = Math.min(size, result);
                sum = sum - nums[low];
                low++;
            }
            high++;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
