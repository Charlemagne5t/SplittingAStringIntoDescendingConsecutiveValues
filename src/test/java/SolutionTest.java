import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        String s = "1234";
        boolean expected = false;
        boolean actual = new Solution().splitString(s);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        String s = "050043";
        boolean expected = true;
        boolean actual = new Solution().splitString(s);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        String s = "9080701";
        boolean expected = false;
        boolean actual = new Solution().splitString(s);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        String s = "4771447713";
        boolean expected = true;
        boolean actual = new Solution().splitString(s);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        String s = "6784450000678444";
        boolean expected = true;
        boolean actual = new Solution().splitString(s);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test6(){
        String s = "0000016371151637114";
        boolean expected = true;
        boolean actual = new Solution().splitString(s);

        Assert.assertEquals(expected, actual);
    }

}
