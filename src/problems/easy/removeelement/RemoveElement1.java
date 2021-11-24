package problems.easy.removeelement;

import java.util.ArrayDeque;
import java.util.Queue;

public class RemoveElement1 implements RemoveElement {
    @Override
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        Queue<Integer> removeIndex = new ArrayDeque();
        int afterRemoveLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                removeIndex.add(i);
            } else {
                afterRemoveLength++;
            }
        }

        for (int i = afterRemoveLength; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[removeIndex.poll()] = nums[i];
            }
        }
        return afterRemoveLength;
    }
}