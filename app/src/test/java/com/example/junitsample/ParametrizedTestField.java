package com.example.junitsample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Tom on 10.08.2017.
 */
@RunWith(Parameterized.class)
public class ParametrizedTestField {
    @Parameterized.Parameter(0)
    public int m1;
    @Parameterized.Parameter(1)
    public int m2;
    @Parameterized.Parameter(2)
    public int result;

    @Parameterized.Parameters()
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{1, 2, 2}, {5, 3, 15}, {121, 4, 484}
        };
        return Arrays.asList(data);
    }
    @Test()
    public void testMultiplyException(){
        MyClass tester = new MyClass();
        assertEquals("Result", result, tester.multiply(m1, m2));
    }

}
