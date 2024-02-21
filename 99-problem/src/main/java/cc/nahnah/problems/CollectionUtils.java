package cc.nahnah.problems;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @Description: 获取list最后一个元素
 */
public class CollectionUtils {

    /*
        A functional approach could be to use recursion.  We call the function recusively with a sub list which ignores the 0th element.
        When we reach the end i.e. size of the list is 1 then we return that element.
    */
    public static <T> T lastRecursive(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (elements.size() == 1) {
            return elements.get(0);
        }
        return lastRecursive(elements.subList(1, elements.size()));
    }

    public static <T> T last(List<T> elements) {
        int numberOfElements = elements.size();
        return elements.get(numberOfElements - 1);
    }

    public static <T> List<T> reverse_IntStream(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("list can't be null");
        }
        int size = list.size();
        return IntStream.iterate(size - 1, el -> el - 1).limit(size).mapToObj(list::get).collect(toList());
    }

    /**
     * <b>(**) Pack consecutive duplicates of list elements into sublists</b>
     * <p>If a list contains repeated elements they should be placed in separate sublists.</p>
     *
     * <pre>
     *     pack(Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
     *     [["a","a","a","a"],["b"],["c","c"],["a","a"],["d"],["e","e","e","e"]]
     * </pre>
     */
    public static <T> List<List<T>> pack(List<T> list) {
        T preElement = null;
        ArrayList<T> elements = new ArrayList<>();
        List<List<T>> packs = new ArrayList<List<T>>();
        for (T t : list) {
            //如果前一个数和当前数相同，添加到list，前一个数指向当前数
            //如果前一个数和当前数不同，新建一个list，将当前list放入packs list中
            if (!Objects.equals(preElement, t)) {
                elements = new ArrayList<>();
                packs.add(elements);
            }
            elements.add(t);
            preElement = t;

        }
        return packs;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        String str = "aaaabbcccddeffffgg";
        List<String> strList = str.chars().mapToObj(c -> String.valueOf((char) c)).collect(toList());
        List<List<String>> pack = pack(strList);
        System.out.println(pack);

        List<String> a = Collections.nCopies(5, "a");
        System.out.println(a);

    }
}
