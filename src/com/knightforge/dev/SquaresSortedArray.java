package com.knightforge.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquaresSortedArray {
    /*
        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
    */
    public int[] sortedSquares(int[] nums) {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }
        if (neg != null && !neg.isEmpty()) {
            for (int i = 0; i < neg.size(); i++) {
                neg.set(i, neg.get(i) * neg.get(i));
            }
            Collections.reverse(neg);
        }
        if (pos != null && !pos.isEmpty()) {
            for (int i = 0; i < pos.size(); i++) {
                pos.set(i, pos.get(i) * pos.get(i));
            }
        }
        int[] original = new int[nums.length];
        int negative = 0, positive = 0, orig = 0;
        while (negative < neg.size() && positive < pos.size()) {
            if (neg.get(negative) < pos.get(positive)) {
                original[orig++] = neg.get(negative++);
            } else {
                original[orig++] = pos.get(positive++);
            }
        }
        while (negative < neg.size()) {
            original[orig++] = neg.get(negative++);
        }
        while (positive < pos.size()) {
            original[orig++] = pos.get(positive++);
        }
        return original;
    }
}
