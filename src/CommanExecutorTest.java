import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommanExecutorTest {

    @Test
    public void test() {

        CommanExecutor commanExecutor = new CommanExecutor();

        assertEquals(3,commanExecutor.execute(1,2, commanExecutor.new Add()));
        assertEquals(10, commanExecutor.execute(12,2, commanExecutor.new Sub()));
        assertEquals(5, commanExecutor.execute(10,2, commanExecutor.new Div()));
        assertEquals(100, commanExecutor.execute(10,10, commanExecutor.new Mult()));

    }
}