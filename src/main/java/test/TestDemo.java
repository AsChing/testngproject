package test;


import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Ching
 * @Date: 2022/04/23 14:31
 * @Description:
 */
public class TestDemo {

    public static Student queryStudent(String level){
        TestInterface test;
        Student student;
        switch (level){
            case "xiaoxue":
                test = new Test01();
                 student = test.getStudent(1);
                break;
            case "chuzhong":
                test = new Test02();
                student = test.getStudent(2);
                break;
            case "high school":
                test = new Test03();
                student = test.getStudent(3);
                break;
            default:
                student = null;
                break;

        }
        return student;
    }

    public static int a(){
        int a = 0;
        return a;
    }


    public static void main(String[] args) {
//        Student student = TestDemo.queryStudent("chuzhong");
//        System.out.println("id是："+student.getId());
//        System.out.println("level是："+student.getLevel());
//        System.out.println("name是："+student.getName());


//         Student xiaoxue = TestDemo.queryStudent("xiaoxue");
//         Student chuzhong = TestDemo.queryStudent("chuzhong");
//         Student highSchool = TestDemo.queryStudent("high school");
//         List<Student> studentList = new ArrayList<>();
//         studentList.add(xiaoxue);
//         studentList.add(chuzhong);
//         studentList.add(highSchool);
//
//         studentList.forEach(student -> System.out.println(student.getId()+student.getLevel()+student.getName()));

        /** 无论 default 位置在前在后，都是先判断 各个case，最后进 default.
        无论 进入某个case 或 default，程序要 执行到 break，或开关的结束 才终止。
         */
//        int k = 1;
//
//        switch (k){
//            default: k = 5;
//            case 2: k += k; break;
//            case 4: k += 2; break;
//        }
//
//        System.out.println(k);
//        int c = 2;
//        c += 1;
//        System.out.println(c);


    }
}
