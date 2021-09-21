import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SequenceTest {

    @Test
    public void test() {

        Sequence sequence = new Sequence(10);
        Sequence.Selector selector = sequence.new Selector(0);

        while (selector.end()) {
            assertNull(selector.current());
            selector.next();
        }
    }

}