package easy.runningSumOf1dArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {

    public static int[] runningSum(int[] nums) {

//        nums[1] = nums[0] + nums[1];
//        nums[2] = nums[1] + nums[2];
//        nums[3] = nums[2] + nums[3];

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {

        System.out.println(runningSum(new int[]{1, 2, 3, 4}));
    }
}
