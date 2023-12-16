package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @author chenw
 * @date 2023/12/17
 */

class StaticMethod {
    public static String getJavaVersion() {
//        throw new RuntimeException();
        return "aa";
    }
}

@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticMethod.class)
public class PowerMockTest {

    @Test
    public void staticMethodMocking() {
        PowerMockito.mockStatic(StaticMethod.class);
        PowerMockito.when(StaticMethod.getJavaVersion()).thenReturn("true");
        Assert.assertEquals("true", StaticMethod.getJavaVersion());
    }

}