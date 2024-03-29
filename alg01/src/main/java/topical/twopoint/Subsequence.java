package topical.twopoint;

/**
 * @author hff
 * @Description:
 */
public class Subsequence {

    /**
    * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     *
     * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
    * */
    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int a = 0;
        int b = 0;
        while(a < sLen && b < tLen){
            if( s.charAt(a) == t.charAt(b)){
                a++;
            }
            b++;
        }
        return a==sLen;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));

    }
}
