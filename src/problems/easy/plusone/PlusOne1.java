package problems.easy.plusone;

//0ms 38.9MB
public class PlusOne1 implements PlusOne {

    @Override
    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] < 9) {
            digits[0] = digits[0] + 1;
            return digits;
        }

        int[] newDigits = prepareNewDigits(digits);
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                newDigits[i] += 1;
                return newDigits;
            } else {
                digits[i] = 0;
            }
        }
        newDigits[0] = 1;
        return newDigits;
    }

    private int[] prepareNewDigits(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                return digits;
            }
        }
        return new int[digits.length + 1];
    }
}