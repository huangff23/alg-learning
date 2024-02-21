package topical.arrayOrString;

/**
 * @author hff
 * @Description:
 * @date 2023/9/1 17:26
 */
public class StringStr {
    /**
    *给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
     * 如果 needle 不是 haystack 的一部分，则返回  -1 。
    * */
    public static int strStr(String haystack, String needle) {
        int res = -1;
        int hLen = haystack.length();
        int nLen = needle.length();

        if (hLen< nLen) {
            return -1;
        }
        for (int i = 0; i <= hLen - nLen; i++) {
            int a = i;
            int b = 0;
            while(b < nLen && haystack.charAt(a) == needle.charAt(b)){
                a++;
                b++;
            }
            if(nLen == b){
                return i;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        //sadbutsad sad
        //leetcode  leeto
        //hello ll
        String hayStack = "a";
        String needle = "a";
        System.out.println(strStr(hayStack, needle));
    }
}
