import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: vvshuai
 * @Description:
 * @Date: Created in 20:26 2020/4/2
 * @Modified By:
 */
public class MainTest {

    @Test
    public void SolveTest1(){
        Main main = new Main();
        int n = 5;
        int[] arr = {1,2,3,4,5};
        main.solve(n,arr);
    }
    @Test
    public void SolveTest2(){
        Main main = new Main();
        int n = -2;
        int[] arr = {1,-4,3};
        main.solve(n,arr);
    }
    @Test
    public void SolveTest3(){
        Main main = new Main();
        int n = 6;
        int[] arr = {-3,1,4,-2,6,5};
        main.solve(n,arr);
    }
}
