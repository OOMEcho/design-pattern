package demo.iterator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 17:35
 * @Description: 抽象聚合角色接口
 */
public interface StudentAggregate {

    /**
     * 添加学生
     */
    void addStudent(Student student);

    /**
     * 删除学生
     */
    void removeStudent(Student student);

    /**
     * 获取迭代器
     */
    StudentIterator getStudentIterator();
}
