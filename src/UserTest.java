import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void test() {

        User user = new User("abcd123@gmail.com", "qwerty123");
        User.LoginAcceptor loginAcceptor = user.new LoginAcceptor();
        assertTrue(loginAcceptor.checkLoginAndPassword("abcd123@gmail.com", "qwerty123"));

        assertFalse(loginAcceptor.checkLoginAndPassword("aaa@gmail.com", "qwerty123"));
    }

}