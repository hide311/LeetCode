package problems.twoSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum3 {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = getTwoNums(nums, target);
        return answer;
    }

    private int[] getTwoNums(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap();
        int searchingNum;
        for (int i = 0; i < nums.length; i++){
            searchingNum = target - nums[i];
            if (map.containsKey(searchingNum)){
                return new int[]{i, map.get(searchingNum)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalStateException();
    }
}