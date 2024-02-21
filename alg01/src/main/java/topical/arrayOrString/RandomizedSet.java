package topical.arrayOrString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author hff
 * @Description:
 *
 * 实现RandomizedSet 类：
 *
 * RandomizedSet() 初始化 RandomizedSet 对象
 * bool insert(int val) 当元素 val 不存在时，向集合中插入该项，并返回 true ；否则，返回 false 。
 * bool remove(int val) 当元素 val 存在时，从集合中移除该项，并返回 true ；否则，返回 false 。
 * int getRandom() 随机返回现有集合中的一项（测试用例保证调用此方法时集合中至少存在一个元素）。每个元素应该有 相同的概率 被返回。
 * 你必须实现类的所有函数，并满足每个函数的 平均 时间复杂度为 O(1) 。
 */
class RandomizedSet {
    private HashMap<Integer, Integer> map;
    private List<Integer> list;
    Random random;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            int len = list.size();
            list.add(val);
            map.put(val, len);
            return true;
        }else {
            return false;
        }
    }

    public boolean remove(int val) {
        if(map.containsKey(val)){
            Integer index = map.get(val);
            Integer last = list.get(list.size() - 1);
            list.set(index, last);
            map.put(last,index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }else {
            return false;
        }
    }

    public int getRandom() {
        int i = random.nextInt(list.size());
        return list.get(i);
    }

    public static void main(String[] args) {

        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1));// 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        System.out.println(randomizedSet.remove(2));// 返回 false ，表示集合中不存在 2 。
        System.out.println(randomizedSet.insert(2));// 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        System.out.println(randomizedSet.getRandom());// getRandom 应随机返回 1 或 2 。
        System.out.println(randomizedSet.remove(1));// 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        System.out.println(randomizedSet.insert(2));// 2 已在集合中，所以返回 false 。
        System.out.println(randomizedSet.getRandom());// 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
    }
}
