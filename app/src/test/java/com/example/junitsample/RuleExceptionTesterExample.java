package com.example.junitsample;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class RuleExceptionTesterExample {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void throwsIllegalArgumentExceptionIfIconIsNull(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Negative value is not allowed");
        MyClass myClass = new MyClass();
        myClass.getSqrtObj(-1);

    }
}
