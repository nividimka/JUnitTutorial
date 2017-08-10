package com.example.junitsample.categories;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(iFastTests.class)
@Categories.ExcludeCategory(iSlowTests.class)
@Suite.SuiteClasses({A.class,B.class})
public class FastTestSuite
{
}
