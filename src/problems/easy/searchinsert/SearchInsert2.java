package problems.easy.searchinsert;

//0 ms	38.4 MB
public class SearchInsert2 implements SearchInsert {
    @Override
    public int searchInsert(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        int middle = (head + tail) / 2;

        while (head <= tail) {
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                head = middle + 1;
            } else {
                tail = middle - 1;
            }
            middle = (head + tail) / 2;
        }
        return head;
    }
}