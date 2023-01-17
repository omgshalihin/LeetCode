package easy.findPivotIndex;

public class Solution {

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < nums.length ; i++) {
            rightSum = rightSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));



    }
}
