package com.example.junitsample.categories;

import com.example.junitsample.CustomRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static junit.framework.Assert.fail;

/**
 * Created by Tom on 10.08.2017.
 */

public class A {
    @Rule
    public CustomRule rule = new CustomRule();
    @Test
    public void a() {
        fail();
    }

    @Category(iSlowTests.class)
    @Test
    public void b(){

    }
}
