package problems.easy.plusone;

import java.util.ArrayList;
import java.util.List;

public class PlusOne4 implements PlusOne {
    @Override
    public int[] plusOne(int[] digits) {
        List<Integer> digitsList = new ArrayList();

        boolean isAdded = false;
        int index = digits.length - 1;

        while (index >= 0) {
            int num = digits[index];
            if (isAdded) {
                digitsList.add(num);
            }
            if (num != 9) {
                digitsList.add(0, num + 1);
                isAdded = true;
            } else {
                digitsList.add(0, 0);
            }
            index--;
        }
        if (!isAdded) {
            digitsList.add(0, 1);
        }
        return digitsList.stream().mapToInt(j -> j).toArray();
    }
}