package demo.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 17:36
 * @Description: 具体聚合角色类
 */
public class StudentAggregateImpl implements StudentAggregate {

    private final List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
