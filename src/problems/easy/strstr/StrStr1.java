package problems.easy.strstr;

//336ms
public class StrStr1 implements StrStr {
    @Override
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}