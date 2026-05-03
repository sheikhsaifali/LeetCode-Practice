package com.knightforge.dev.sliding_window;

import java.util.HashMap;

public class Fruit_Into_Baskets {
    /*
     * Input: fruits = [1,2,3,2,2]
     * Output: 4
     */
    public int totalFruit(int[] fruits) {
        int high = 0, low = 0, result = Integer.MIN_VALUE;
        HashMap<Integer, Integer> nums = new HashMap<>();
        for (; high < fruits.length; high++) {
            nums.put(fruits[high], nums.getOrDefault(fruits[high], 0) + 1);
            while (nums.size() > 2) {
                nums.put(fruits[low], nums.getOrDefault(fruits[low], 0) - 1);
                if (nums.get(fruits[low]) == 0) {
                    nums.remove(fruits[low]);
                }
                low++;
            }
            result = Math.max(result, (high - low) + 1);
        }
        return (result == Integer.MIN_VALUE) ? result = 1 : result;
    }
}
