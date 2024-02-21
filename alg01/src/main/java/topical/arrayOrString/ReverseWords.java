package topical.arrayOrString;

import java.util.Stack;

/**
 * @author hff
 * @Description:
 * @date 2023/9/1 10:04
 */
public class ReverseWords {

    /**
    * 给你一个字符串 s ，请你反转字符串中 单词 的顺序。
     * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
     * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
     * 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
    * */
    public static String reverseWords(String s) {
        String[] array = s.trim().split(" ");

        Stack stack = new Stack();
        for (String str : array) {
            if(str != ""){
                stack.push(str);
            }
        }
        stack.stream().peek(System.out::println);
        StringBuilder sb = new StringBuilder();
        sb.append(stack.pop());
        while (!stack.empty()){
            sb.append(" ");
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String s2 = "a good   example";
        String reverseWords = reverseWords(s2);
        System.out.println(reverseWords);
    }
}
