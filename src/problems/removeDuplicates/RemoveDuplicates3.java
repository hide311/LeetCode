package problems.removeDuplicates;

public class RemoveDuplicates3 implements RemoveDuplicates {
    @Override
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int keyNum = 0;
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && keyNum == nums[i]) {
                continue;
            }
            keyNum = nums[i];
            nums[position] = nums[i];
            position++;
        }
        return position;
    }
}