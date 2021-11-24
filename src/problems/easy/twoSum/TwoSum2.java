package problems.easy.twoSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum2 {
    static int[] nums;
    static int target;

    public static void main(String[] args) {
        prepareParams();
        long startTime = System.currentTimeMillis();

        int[] answer = getTwoNums();

        long endTime = System.currentTimeMillis();
        submitAnswer(answer);
        System.out.println(endTime - startTime + "ms has passed");
    }

    private static void prepareParams() {
        List<Integer> numsList = new ArrayList<>();

        numsList.add(3);
        numsList.add(2);
        numsList.add(4);
        numsList.add(1);

        nums = numsList.stream().mapToInt(i -> i).toArray();
        target = 6;
    }

    private static int[] getTwoNums() {
        Map<Integer, Integer> map = new HashMap();
        int searchingNum;
        for (int i = 0; i < nums.length; i++) {
            searchingNum = target - nums[i];
            if (map.containsKey(searchingNum)) {
                return new int[]{i, map.get(searchingNum)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum combination");
    }

    private static void submitAnswer(int[] answer) {
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

}