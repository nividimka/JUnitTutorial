package com.example.junitsample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AssertStatement {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested

        // assert statements
        assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
        assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
        assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
    }

    //    @Test
//    public void exception() throws Exception {
//        fail("fail");
//        MyClass tester = new MyClass(); // MyClass is tested
//        assertEquals("12",tester.throwAnException());
//    }
    @Test
    public void isTrue() {
        MyClass tester = new MyClass(); // MyClass is tested
        assertTrue("this is true", tester.methodTrue());
    }

    @Test
    public void isFalse() {
        MyClass tester = new MyClass(); // MyClass is tested
        assertFalse("this is false", !tester.methodTrue());
    }

    @Test
    public void checkSimplity() {
        MyClass tester = new MyClass();
        assertEquals(tester.getValue1(), tester.getValue2(), 0.001);
    }

    @Test
    public void checkNullable() {
        MyClass tester = new MyClass();
        assertNull("asdasd", tester.getObj());
    }
    @Test
    public void checkNotNullable() {
        MyClass tester = new MyClass();
        assertNotNull("asdasd", tester.getValue1());
    }

    @Test
    public void checkSameable() {
        MyClass tester = new MyClass();
        MyClass tester2 = tester;
        assertSame("asdasd", tester,tester2);
    }

    @Test
    public void checkNotSameable() {
        MyClass tester = new MyClass();
        MyClass tester2 = new MyClass();
        assertNotSame("asdasd", tester,tester2);
    }

}