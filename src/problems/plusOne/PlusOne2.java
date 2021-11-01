package problems.plusOne;

import java.util.ArrayList;
import java.util.List;

//7ms 39.4MB
public class PlusOne2 implements PlusOne {
    @Override
    public int[] plusOne(int[] digits) {
        List<Integer> digitsList = new ArrayList();

        boolean isAdded = false;
        int index = digits.length - 1;
        while (index >= 0) {
            int num = digits[index];
            if (num != 9) {
                int plusOne = isAdded ? num : num + 1;
                digitsList.add(0, plusOne);
                isAdded = true;
            } else {
                int plusOne = isAdded ? 9 : 0;
                digitsList.add(0, plusOne);
            }
            index--;
        }
        if (!isAdded) {
            digitsList.add(0, 1);
        }
        return digitsList.stream().mapToInt(j -> j).toArray();
    }
}