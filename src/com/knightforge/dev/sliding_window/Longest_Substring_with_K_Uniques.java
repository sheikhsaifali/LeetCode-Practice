package com.knightforge.dev.sliding_window;

import java.util.HashMap;

public class Longest_Substring_with_K_Uniques {
    /*
     *Input: s = "aabacbebebe", k = 3
     *Output: 7
     */
    public int longestKSubstr(String s, int k) {
        int high = 0, low = 0, result = Integer.MIN_VALUE;
        HashMap<Character, Integer> chars = new HashMap<>();
        for(high = 0; high < s.length(); high++)
        {
            chars.put(s.charAt(high), chars.getOrDefault(s.charAt(high), 0)+1);
            while(k<chars.size())
            {
                chars.put(s.charAt(low), chars.getOrDefault(s.charAt(low), 0)-1);
                if(chars.get(s.charAt(low))==0)
                {
                    chars.remove(s.charAt(low));
                }
                low++;
            }
            if(k==chars.size())
                result = Math.max(result, (high-low)+1);
        }
        return result==Integer.MIN_VALUE?-1:result;
    }
}
