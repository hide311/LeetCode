package problems.easy.maximumSubarray;

public class MaximumSubarray2 implements MaximumSubarray {
    @Override
    public int maxSubArray(int[] nums) {
        int maxNum = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            maxNum = Math.max(maxNum, sum);
        }
        return maxNum;
    }
}