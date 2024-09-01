import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 08-29-16:00
 * 测试类
 */
public class MathSuanTest {
    //公开 无返回值 无参数
    @Test
    public void testAdd(){
        MathSuan.add(2/0,2.3);
    }

    @Test
    public void testReduce(){
        double v = MathSuan.reduce(8, 1);
//        Assert.assertEquals("方法有bug",7,v);
        Assert.assertEquals("哥们儿你有bug",7,v);
    }
}
