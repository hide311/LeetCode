package problems.maximumSubarray;

//[-2,1,-3,4,-1,2,1,-5,4]
public class MaximumSubarray1 implements MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int maxNum = Integer.MIN_VALUE;

        // i はいくつの数字を足すかを表す。
        for (int i = 0; i < nums.length; i++) {
            // 何番目まで見るか
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                    if (maxNum < sum) {
                        maxNum = sum;
                    }
                }
            }
        }
        return maxNum;
    }
}