package test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Ching
 * @Date: 2022/05/12 14:48
 * @Description:
 */
public class Single {
    private Single(){};
    private static Single s = new Single();
    private static Single getInstance(){
        return s;
    }

    class Single1{
        private void single1(){};
        private Single s1 = new Single();
    }

    class Single2{

    }
}
