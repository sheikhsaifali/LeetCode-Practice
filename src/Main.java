import com.knightforge.dev.sliding_window.*;
import com.knightforge.dev.two_pointer.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Two Sum II");
        TwoSumII twoSumII = new TwoSumII();
        Arrays.stream(twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::print);
        System.out.println();
        System.out.println("Remove Duplicates from Array:");
        RemoveDuplicatesArray rda = new RemoveDuplicatesArray();
        System.out.print(rda.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 41}));
        System.out.println();
        System.out.println("Merge Two Sorted Array:");
        new MergeTwoArray().merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        System.out.println();
        System.out.println("Square of Sorted Array:");
        SquaresSortedArray sqa = new SquaresSortedArray();
        Arrays.stream(sqa.sortedSquares(new int[]{2, 3, 3, 4})).forEach(System.out::print);
        System.out.println("Three sum of array:");
        new Three_Sum().threeSum(new int[]{-1,0,1,2,-1,-4}).stream().forEach(System.out::println);
        System.out.println("Max Sum Subarray of size K:");
        System.out.println(new Max_Sum_Subarray().maxSubarraySum(new int[]{100, 200, 300, 400}, 3));
        System.out.println("Minimum Size Subarray Sum:");
        System.out.println(new Minimum_Size_Subarray_Sum().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        System.out.println("Longest Substring with K Uniques:");
        System.out.println(new Longest_Substring_with_K_Uniques().longestKSubstr("aabacbebebe", 3));
        System.out.println("Fruit Into Baskets:");
        System.out.println(new Fruit_Into_Baskets().totalFruit(new int[]{1,2,3,2,2}));
        System.out.println("Longest Substring Without Repeating Characters:");
        System.out.println(new Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring("pwwkew"));
    }
}