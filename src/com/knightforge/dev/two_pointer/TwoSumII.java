package com.knightforge.dev.two_pointer;

public class TwoSumII
{
    // numbers = [2,7,11,15], target = 9
    public int[] twoSum(int[] numbers, int target)
    {
        if(numbers.length == 0)
        {
            return null;
        }
        else
        {
            int start = 0, end = numbers.length-1, sum = 0;
            while(start<end)
            {
                sum = numbers[start] + numbers[end];
                if(sum == target)
                {
                    return new int[]{start+1, end+1};
                }
                else if(sum < target)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        }
        return null;
    }
}