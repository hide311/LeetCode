package problems.searchInsert;

//0 ms	38.5 MB
public class SearchInsert1 implements SearchInsert {
    @Override
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (target <= num) {
                return count;
            }
            count++;
        }
        return count;
    }
}