import com.knightforge.dev.TwoSumII;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        Arrays.stream(twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::println);
    }
}