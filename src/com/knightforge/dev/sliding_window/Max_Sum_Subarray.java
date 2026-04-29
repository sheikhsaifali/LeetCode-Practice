package com.knightforge.dev.sliding_window;

public class Max_Sum_Subarray
{
    /*
    *Input: arr[] = [100, 200, 300, 400], k = 2
    *Output: 700
     */
    public int maxSubarraySum(int[] arr, int k) {
        int high = k-1, low = 0, result = 0, sum = 0;
        for(int i=low;i<=high;i++)
        {
            sum = sum + arr[i];
        }
        while (high<arr.length)
        {
            result = Math.max(result, sum);
            high++;
            low++;
            if (high==arr.length)
            {
                break;
            }
            sum = sum +arr[high]-arr[low-1];
        }
        return result;
    }
}
