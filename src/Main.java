import com.knightforge.dev.MergeTwoArray;
import com.knightforge.dev.RemoveDuplicatesArray;
import com.knightforge.dev.TwoSumII;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        RemoveDuplicatesArray rda = new RemoveDuplicatesArray();
        Arrays.stream(twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::println);
        System.out.println(rda.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,41}));
        new MergeTwoArray().merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }
}