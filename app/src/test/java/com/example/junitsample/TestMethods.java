package com.example.junitsample;

import android.util.Log;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Tom on 07.08.2017.
 */

public class TestMethods {
    ArrayList<String> array = new ArrayList<>();

    @Before()
    public void beforeMethod() {
        array.add("123");
        array.add("456");
        array.add("456");
        array.add("123");

    }

    @Test
    public void simpleTestMethod() {
        assertEquals(array.get(0), array.get(3));
    }

    @Ignore("ignorred")
    public void ignorredCase() {
        assertEquals("as", "asd");
    }

    @After()
    public void afterMethod() {
        array.clear();
    }

    @Test(expected = Exception.class)
    public void exceptionMethod() throws Exception {
        throw new Exception();
    }

    @Test(timeout = 100)
    public void testPerf() {
//        Assume.assumeFalse(System.getProperty("os.name").contains("Windows"));
        int x = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 100; j++) {
                x -= 0.0000001;
            }
            x += 1;
        }
    }
    @BeforeClass()
    public static void beforeClassExecution(){
        System.out.println("beforeClass");
    }
    @AfterClass()
    public static void afterClassExecution(){
        System.out.println("afterClass");
    }
}
