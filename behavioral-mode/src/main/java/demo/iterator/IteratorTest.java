package demo.iterator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 17:38
 * @Description:
 */
public class IteratorTest {
    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();

        Student student1 = new Student();
        student1.setName("张三");
        student1.setNumber("1");
        studentAggregate.addStudent(student1);

        Student student2 = new Student();
        student2.setName("李四");
        student2.setNumber("2");
        studentAggregate.addStudent(student2);

        Student student3 = new Student();
        student3.setName("王五");
        student3.setNumber("3");
        studentAggregate.addStudent(student3);

        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
    }
}
