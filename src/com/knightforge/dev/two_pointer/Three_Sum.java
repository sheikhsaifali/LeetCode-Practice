package com.knightforge.dev.two_pointer;

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
        Arrays.sort(nums);//[-4,-1,-1,0,1,2]
        int left = 0, right =0, sum = 0, s = 0;
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])//Unique for place i
            {
                continue;
            }
            left=i+1;
            right=nums.length-1;
            sum=-1*nums[i];
            //Two Sum
            while(left<right)
            {
                s=nums[left]+nums[right];
                if(sum>s)
                {
                    left++;
                }
                else if(sum<s)
                {
                    right--;
                }
                else
                {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    //unique for left and right
                    while(left<nums.length && nums[left-1]==nums[left])
                    {
                        left++;
                    }
                    while(right>=0 && nums[right+1]==nums[right])
                    {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
