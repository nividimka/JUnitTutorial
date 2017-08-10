package com.example.junitsample.categories;

import com.example.junitsample.CustomRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by Tom on 10.08.2017.
 */
@Category({iSlowTests.class, iFastTests.class})
public class B {
    @Rule
    public CustomRule rule = new CustomRule();

    @Test
    public void c(){

    }
}
