package com.knightforge.dev.two_pointer;

import java.util.Arrays;

public class MergeTwoArray {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        int[] pivot = new int[nums1.length];
        int num1 = 0, num2 = 0, p = 0, r = 0;
        while(nums1.length > num1 && n > num2)
        {
            if(nums1[num1] < nums2[num2] && m > num1)
            {
                pivot[p] = nums1[num1];
                p++;
                num1++;
            }
            else
            {
                pivot[p] = nums2[num2];
                num2++;
                p++;
            }
        }
        while(nums1.length > num1 && m > num1)
        {
            pivot[p] = nums1[num1];
            num1++;
            p++;
        }
        while(p>0)
        {
            nums1[r] = pivot[r];
            r++;
            p--;
        }
        //Arrays.stream(pivot).forEach(System.out::println);
    }
}
