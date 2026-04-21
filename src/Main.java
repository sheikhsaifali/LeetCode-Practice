import com.knightforge.dev.MergeTwoArray;
import com.knightforge.dev.RemoveDuplicatesArray;
import com.knightforge.dev.SquaresSortedArray;
import com.knightforge.dev.TwoSumII;

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
    }
}