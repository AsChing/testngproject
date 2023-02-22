package test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Ching
 * @Date: 2022/04/23 13:59
 * @Description:
 */
public class Test01 implements TestInterface {

    @Override
    public void setStudent(Student student) {
        System.out.println("set student xiaoxue success!");
    }

    @Override
    public Student getStudent(int id) {
        if(id == 1){
            Student student = new Student();
            student.setId(1);
            student.setName("lucy");
            student.setLevel("xiaoxue");
            return student;
        }else {
            return null;
        }
    }
    public void test(){

    }

}
