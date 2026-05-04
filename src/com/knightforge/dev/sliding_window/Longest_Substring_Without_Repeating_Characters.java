package com.knightforge.dev.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int high = 0, low = 0, result = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for (; high < s.length(); high++)
        {
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0)+1);
            while((high - low)+1 >map.size())
            {
                map.put(s.charAt(low), map.getOrDefault(s.charAt(low), 0)-1);
                if(map.get(s.charAt(low))==0)
                {
                    map.remove(s.charAt(low));
                }
                low++;
            }
            result = Math.max(result, (high - low) + 1);
        }
        return result==Integer.MIN_VALUE?0:result;
    }
}
