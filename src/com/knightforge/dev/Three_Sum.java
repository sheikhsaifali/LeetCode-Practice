package com.knightforge.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {

    /*
        Input: nums = [-1,0,1,2,-1,-4]
        Output: [[-1,-1,2],[-1,0,1]]
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int sum = 0;
        int s = 0;
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            left=i+1;
            right=nums.length-1;
            sum = -1*nums[i];
            while(left<right)
            {
                s=nums[left]+nums[right];
                if(s==sum)
                {
                    arr.add(nums[i]);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    result.add(arr);
                    arr=new ArrayList<>();
                    left++;
                    right--;
                    while(left<nums.length && nums[left]==nums[left-1])
                    {
                        left++;
                    }
                    while(right>=0 && nums[right]==nums[right+1])
                    {
                        right--;
                    }
                }
                else if(s<sum)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return result;
    }
}
