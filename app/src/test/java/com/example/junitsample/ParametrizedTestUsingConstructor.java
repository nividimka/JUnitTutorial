package com.example.junitsample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ParametrizedTestUsingConstructor {

    private int m1;
    private int m2;
    private int result;

    public ParametrizedTestUsingConstructor(int m1, int m2, int result) {
        this.m1 = m1;
        this.m2 = m2;
        this.result = result;
    }
    @Parameterized.Parameters()
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][]{{1,4,4},{1,2,2},{3,3,9},{14,14,196}};
        return Arrays.asList(data);
    }
    @Test()
    public void testMultiplication(){
        MyClass tester = new MyClass();
        assertEquals("mult result",result,m1*m2);

    }
}
