package problems.easy.removeDuplicates;

public class RemoveDuplicates1 implements RemoveDuplicates {
    @Override
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;


        int keyNum = nums[0];
        int maxNum = nums[nums.length - 1];
        int position = 0;
        for (int i = 0; keyNum <= maxNum; i++) {
            if (keyNum == maxNum - 1) {
                nums[position] = maxNum;
                return position + 1;
            }
            while (keyNum == nums[i]) {
                i++;
            }
            nums[position] = nums[i - 1];
            position++;
            keyNum = nums[i];
        }
        return -1;
    }
}