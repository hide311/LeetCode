package problems.easy.addbinary;

//2ms
public class AddBinary2 implements AddBinary {
    @Override
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        boolean hasCarryUp = false;

        for (int i = 0; i < maxLength + 1; i++) {
            String sumBinary = "";
            String aStr = getNumStrAt(a, i);
            String bStr = getNumStrAt(b, i);

            //「a」「b」「くりあがり」の3つを比較して、数字を決める
            if (aStr.equals("0") && bStr.equals("0")) {
                sumBinary = hasCarryUp ? "1" : "0";
                hasCarryUp = false;
            } else if (aStr.equals("1") && bStr.equals("1")) {
                sumBinary = hasCarryUp ? "1" : "0";
                hasCarryUp = true;
            } else {
                sumBinary = hasCarryUp ? "0" : "1";
                hasCarryUp = hasCarryUp ? true : false;
            }
            sb.insert(0, sumBinary);
        }
        return sb.toString();
    }

    private String getNumStrAt(String str, int i) {
        int strLnegth = str.length();
        if (strLnegth <= i) {
            return "0";
        }
        return str.substring(strLnegth - i - 1, strLnegth - i);
    }
}