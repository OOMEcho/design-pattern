package demo.iterator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 17:32
 * @Description: 抽象迭代器角色接口
 */
public interface StudentIterator {

    /**
     * 是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 返回当前元素并将位置移至下一位
     */
    Student next();

}
