package topical.twopoint;

import java.util.Stack;

/**
 * @author hff
 * @Description:
 */
public class Palindrome {

    /**
    *如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
     * 字母和数字都属于字母数字字符。
     *
     * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
    * */
    public static boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder originSb = new StringBuilder();
        for (char c : charArray) {
            char lower = upCharToLower(c);
            if(isNumChar(lower)){
                originSb.append(lower);
                stack.push(lower);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        System.out.println("originSb: " + originSb);
        System.out.println("sb: " + sb);
        return originSb.toString().equals(sb.toString());
    }

    /**
    * 是否是字母数字字符
    * */
    public static boolean isNumChar(char c){
        if(c > 96 && c < 123){
            return true;
        }
        if(c > 47 && c < 58){
            return true;
        }
        return false;
    }
    /**
     * 是否是字母数字字符
     * */
    public static char upCharToLower(char c){
        if(c >= 65 && c <= 90){
            return (char) (c + 32);
        }
        return c;
    }

    /**
    * 双指针
    * */
    public static boolean isPalindrome_2(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String s1 = sb.toString();
        int length = s1.length();
        int left = 0;
        int right = length-1;
        while (left < right){
            if(Character.toLowerCase(s1.charAt(left)) != Character.toLowerCase(s1.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "race a car";

        System.out.println("回文：" + isPalindrome_2(str));

    }
}
