package classwork.day22;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({MyTestNGListeners.class})
public class MyClassTest {

    @Test(description = "158033")
    public void test1() {
        Assert.assertTrue(true);
    }

    @Test(description = "158035")
    public void test2() {
        Assert.assertTrue(true);
    }

    @Test(description = "158037")
    public void test3() {
        Assert.assertTrue(true);
    }

    @Test(description = "158038")
    public void test4() {
        Assert.assertTrue(false);
    }
}
