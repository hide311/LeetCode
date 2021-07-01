package investigate;

import java.util.*;

public class ArraySortSpeed {
    final static int TEST_DATA_COUNT = 10000;
    static int[] testData = new int[TEST_DATA_COUNT];

    public static void main(String[] args) {
        prepareData();
        sortWithSimpleSort();

        prepareData();
        sortWithStreamSorted();

        prepareData();
        sortWithQuickSort();
    }

    private static void prepareData(){
        List<Integer> testDataList = new ArrayList();
        for (int i = 0; i < TEST_DATA_COUNT; i++){
            testDataList.add(i);
        }
        Collections.shuffle(testDataList);

        int i = 0;
        for (int data:testDataList){
            testData[i] = data;
            i++;
        }
    }

    private static void sortWithSimpleSort(){
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < testData.length-1; i++){
            int minPos = getMinPosition(testData, i);
            int temp = testData[i];
            testData[i] = testData[minPos];
            testData[minPos] = temp;
        }

        long endTime = System.currentTimeMillis();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + "：" + (endTime-startTime) + "ms has passed.");
        //outputResult();
    }

    private static int getMinPosition(int[] nums,int i) {
        int min = nums[i];
        int minPos = i;
        for (int j = i; j < nums.length; j++){
            if (j == 0 || min > nums[j]){
                min = nums[j];
                minPos = j;
            }
        }
        return minPos;
    }

    private static void sortWithQuickSort(){
        long startTime = System.currentTimeMillis();
        doQuickSort(testData,0, testData.length -1);
        long endTime = System.currentTimeMillis();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + "：" + (endTime-startTime) + "ms has passed.");
        //outputResult();
    }

    private static void doQuickSort(int[] array, int left, int right){
        if(left >= right){
            return;
        }
        int criterion = array[(left+right)/2];
        int l = left;
        int r = right;
        int tmp;
        while(l <= r){
            while(array[l] < criterion){
                l++;
            }
            while(array[r] > criterion){
                r--;
            }

            if(l <= r){
                tmp = array[r];
                array[r] = array[l];
                array[l] = tmp;
                l++;
                r--;
            }
        }
        doQuickSort(array,left, r);
        doQuickSort(array, l, right);
    }

    private static void sortWithStreamSorted(){
        long startTime = System.currentTimeMillis();

        testData = Arrays.stream(testData).sorted().toArray();

        long endTime = System.currentTimeMillis();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + "：" + (endTime-startTime) + "ms has passed.");
        //outputResult();
    }


    private static void outputResult(){
        for (int data: testData){
            System.out.println(Integer.toString(data));
        }
    }

}
