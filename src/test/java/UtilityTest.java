package test.java;

import main.java.Utility;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utility.class)
public class UtilityTest {

    @Test
    public void verifySayHelloStaticMethod() {
     // TODO
    }

    @Test
        public void verifyGetGreetingMessagePrivateMethod() throws Exception {
      // TODO
    }

    @Test
        public void verifyGetGreetingMessageFinalMethod() throws Exception {
        // TODO
    }
}