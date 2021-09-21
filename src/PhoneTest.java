import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneTest {

    @Test
    public void test() {

        Phone phone = new Phone.Builder()
                .setColor("black")
                .setName("IPhone")
                .setSize(20)
                .setCost(100000)
                .build();

        assertEquals("black", phone.getColor());
        assertEquals("IPhone", phone.getName());
        assertEquals(20, phone.getSize());
        assertEquals(100000, phone.getCost());
    }
}