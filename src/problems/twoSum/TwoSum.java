package problems.twoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    static int[] nums;
    static int target;

    public static void main(String[] args) {
        prepareParams();
        long startTime = System.currentTimeMillis();
        int[] answer = getTwoNums();
        long endTime = System.currentTimeMillis();
        submitAnswer(answer);
        System.out.println(endTime-startTime+"ms has passed");
    }

    private static void prepareParams(){
        List<Integer> numsList = new ArrayList<>();

        numsList.add(1);
        numsList.add(3);
        numsList.add(4);
        numsList.add(2);

        nums = numsList.stream().mapToInt(i->i).toArray();
        target = 6;
    }

    private static int[] getTwoNums() {
        int searchingNum;
        int[] twoNumsArray = new int[2];
        for (int i = 0; i < nums.length; i++){
            searchingNum = target - nums[i];
            for (int j = nums.length - 1; j > 0; j--){
                if ((searchingNum == nums[j]) && (i != j)) {
                    twoNumsArray[0] = i;
                    twoNumsArray[1] = j;
                    return twoNumsArray;
                }
            }
        }
        throw new IllegalArgumentException("No two sum combination");
    }

    private static void submitAnswer(int[] answer){
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

}
