package problems.easy.addBinary;

//2ms
public class AddBinary3 implements AddBinary {
    @Override
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        int carryUp = 0;

        for (int i = 0; i < maxLength + 1; i++) {
            int aAt = getNumAt(a, i);
            int bAt = getNumAt(b, i);

            int sum = aAt + bAt + carryUp;
            int sumBinary;

            if (sum >= 2) {
                sumBinary = sum % 2;
                carryUp = 1;
            } else {
                sumBinary = sum % 2;
                carryUp = 0;
            }
            sb.insert(0, sumBinary);
        }
        return sb.toString();
    }

    private int getNumAt(String str, int i) {
        int strLnegth = str.length();
        if (strLnegth <= i) {
            return 0;
        }
        return Integer.parseInt(str.substring(strLnegth - i - 1, strLnegth - i));
    }
}