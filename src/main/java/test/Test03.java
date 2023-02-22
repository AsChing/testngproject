package test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Ching
 * @Date: 2022/04/23 14:29
 * @Description:
 */
public class Test03 implements TestInterface{
    @Override
    public void setStudent(Student student) {
        System.out.println("set student high school success!");
    }

    @Override
    public Student getStudent(int id) {
        if(id == 3){
            Student student = new Student();
            student.setId(3);
            student.setName("Tom");
            student.setLevel("high school");
            return student;
        }else {
            return null;
        }
    }
}
