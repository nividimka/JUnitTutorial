package com.example.junitsample.categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Tom on 10.08.2017.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(iSlowTests.class)
@Suite.SuiteClasses({A.class,B.class})
public class SlowTestSuite {
}
