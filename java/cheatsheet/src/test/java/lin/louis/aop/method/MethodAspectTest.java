package lin.louis.aop.method;

import lin.louis.aop.mock.FooService;
import lin.louis.config.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class MethodAspectTest {
    @Autowired
    private FooService fooService;

    @Test
    public void testMethodAspect() {
        fooService.foo("testMethodAspect");
    }
}
