package problems.easy.strStr;


//1408ms
public class StrStr3 implements StrStr {
    @Override
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        char firstNeedle = needle.charAt(0);
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (firstNeedle == haystack.charAt(i)) {
                if (areEqual(haystack, needle, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private boolean areEqual(String haystack, String needle, int i) {
        for (int j = 1; j < needle.length(); j++) {
            char c1 = needle.charAt(j);
            char c2 = haystack.charAt(i + j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}