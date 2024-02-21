package topical.arrayOrString;

/**
 * @author hff
 * @Description:
 */
public class LongestCommonPrefix {

    /**
    * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""。
     * 示例 1：
     * 输入：strs = ["flower","flow","flight"]
     * 输出："fl"
    * */
    public static String longestCommonPrefix(String[] strs) {
        int minStrIdx = 0;
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length() < strs[minStrIdx].length()){
                minStrIdx = i;
            }
        }
        System.out.println("minStrIdx :" + minStrIdx);
        int len = strs.length;
        String shortStr = strs[minStrIdx];
        int end = 0;
        boolean flag = false;
        for (int i = 0; i < shortStr.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i) != shortStr.charAt(i)){
                    System.out.println("i :" + i);
                    return shortStr.substring(0, i);
                }
            }

        }
        return shortStr;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs2 = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs2));
    }
}
