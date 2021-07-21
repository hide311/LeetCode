package problems.longestCommonPrefix;

public class LongestCommonPrefix1 implements LongestCommonPrefix {
    @Override
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                commonPrefix = strs[i];
                continue;
            }
            commonPrefix = trimCommonPrefix(commonPrefix, strs[i]);
            if (commonPrefix.isEmpty()) {
                return "";
            }
        }
        return commonPrefix;
    }

    private String trimCommonPrefix(String commonPrefix, String str) {
        while ((!str.startsWith(commonPrefix)) && (commonPrefix != "")) {
            commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
        }
        return commonPrefix;
    }
}