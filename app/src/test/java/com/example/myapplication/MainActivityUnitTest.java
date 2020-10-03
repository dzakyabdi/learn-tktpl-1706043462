package com.example.myapplication;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainActivityUnitTest extends TestCase {
    MainActivity mainActivity;

    @Before
    public void setUp() {
        mainActivity = new MainActivity();
    }

    @Test
    public void test_even_check(){
        assertTrue(mainActivity.cekEven(4));
    }

    @After
    public void tearDown(){}
}
