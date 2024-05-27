import junit.framework.Assert;
import org.junit.Test;

public class LoginTests {
    Login login = new Login();

    @Test
    public void loginTest1(){
        Assert.assertTrue(login.login("correctUsername", "correctPassword"));
    }
    @Test
    public void loginTest2() {
        Assert.assertFalse(login.login("", "blabla"));
    }
    @Test
    public void loginTest3(){
        Assert.assertTrue(login.login("blabla", "null"));
    }
}


