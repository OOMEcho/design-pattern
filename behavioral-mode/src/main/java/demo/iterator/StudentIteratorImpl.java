package demo.iterator;

import java.util.List;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 17:33
 * @Description: 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator {

    private final List<Student> list;

    private int position;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
}
