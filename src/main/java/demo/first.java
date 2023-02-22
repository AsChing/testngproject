package demo;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Ching
 * @Date: 2023/02/17 14:57
 * @Description:
 */

public class first {

    @Test
    public void demo1(){
        System.out.println("demo111111");
    }

    @Test(enabled = false)
    public void demo2(){
        System.out.println("demo222222");
    }
}
