package problems.easy.removeDuplicates;

public class RemoveDuplicates4 implements RemoveDuplicates {
    @Override
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            nums[position] = nums[i];
            position++;
        }
        return position;
    }
}