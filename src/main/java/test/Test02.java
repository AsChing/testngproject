package test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Ching
 * @Date: 2022/04/23 14:24
 * @Description:
 */
public class Test02 implements TestInterface{

    @Override
    public void setStudent(Student student) {
        System.out.println("set student chuzhong success!");
    }

    @Override
    public Student getStudent(int id) {
        if(id == 2){
            Student student = new Student();
            student.setId(2);
            student.setName("Jack");
            student.setLevel("chuzhong");
            return student;
        }else {
            return null;
        }
    }
}
