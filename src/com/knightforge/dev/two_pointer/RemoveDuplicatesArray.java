package com.knightforge.dev.two_pointer;

public class RemoveDuplicatesArray {
    public int removeDuplicates(int[] nums) {
       /* Input: nums = [0,0,1,1,1,2,2,3,3,4]
        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]*/
        int pm = 1, ofcr = 1;
        while(pm < nums.length)
        {
            if(nums[pm]==nums[pm-1])
            {
                pm++;
            }
            else
            {
                nums[ofcr] = nums[pm];
                ofcr++;
                pm++;
            }
        }
        return ofcr;
    }
}
