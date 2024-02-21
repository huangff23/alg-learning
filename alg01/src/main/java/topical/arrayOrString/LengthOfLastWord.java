package topical.arrayOrString;

/**
 * @author hff
 * @Description:
 */
public class LengthOfLastWord {

    /**
    * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
     *
     * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
    * */
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        boolean flag = false;
        int a = 0;
        int b = 0;
        for (int i = n - 1; i >= 0; i--) {
            if(s.charAt(i) != ' '){
                a = i;
                break;
            }
        }
        b = a;
        while(b>=0 && s.charAt(b)!= ' '){
            b--;
        }

        System.out.println("a: " + a + " b: " + b);
        return b -a;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "a";
        int i = lengthOfLastWord(s2);
    }
}
