package problems.easy.strStr;

//305ms
public class StrStr2 implements StrStr {
    @Override
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        char firstNeedle = needle.charAt(0);
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (firstNeedle == haystack.charAt(i)) {
                String s = haystack.substring(i, i + needle.length());
                if (s.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}