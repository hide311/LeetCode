package problems.easy.removeDuplicates;

public class RemoveDuplicates2 implements RemoveDuplicates {
    @Override
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;


        int keyNum = 0;
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (keyNum > 0 && keyNum == nums[i]) {
                break;
            }

            keyNum = nums[i];
            nums[position] = keyNum;
            position++;
            while (i + 1 < nums.length) {
                if (keyNum == nums[i + 1]) {
                    i++;
                } else {
                    break;
                }
            }
        }
        return position;
    }
}