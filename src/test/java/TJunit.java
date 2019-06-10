import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by JieChen on 2019/6/10.
 */
public class TJunit {
    @Test
    public void add() {
        int sum=new T().add(2,5);
        assertEquals(7,sum);
        assertTrue("sum < 8 ? ",sum>8);
    }
}
