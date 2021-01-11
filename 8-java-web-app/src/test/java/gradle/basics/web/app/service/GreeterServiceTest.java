package gradle.basics.web.app.service;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GreeterServiceTest {

    private GreeterService subject = new GreeterService();

    @Test
    public void greetTest() {
        String result = subject.getGreet();
        assertTrue("Greetings Service Working: ", result != null);
    }
}