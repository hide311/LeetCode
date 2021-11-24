package problems.easy.addBinary;

//3ms
public class AddBinary1 implements AddBinary {
    @Override
    public String addBinary(String a, String b) {
        String answer = "";
        int maxLength = Math.max(a.length(), b.length());
        int carryUp = 0;

        for (int i = 0; i < maxLength; i++) {
            String sumBinary = "";
            String aStr = getNumStrAt(a, i);
            String bStr = getNumStrAt(b, i);

            if (aStr.equals("0") && bStr.equals("0")) {
                sumBinary = Integer.toString(carryUp);
                carryUp = 0;
            } else if (aStr.equals("1") && bStr.equals("1")) {
                sumBinary = carryUp == 0 ? "0" : "1";
                carryUp = 1;
            } else {
                sumBinary = carryUp == 0 ? "1" : "0";
                carryUp = carryUp == 0 ? 0 : 1;
            }
            answer = sumBinary + answer;
        }
        if (carryUp == 1) {
            answer = carryUp + answer;
        }
        return answer;
    }

    private String getNumStrAt(String str, int i) {
        int strLnegth = str.length();
        if (strLnegth <= i) {
            return "0";
        }
        return str.substring(strLnegth - i - 1, strLnegth - i);
    }
}