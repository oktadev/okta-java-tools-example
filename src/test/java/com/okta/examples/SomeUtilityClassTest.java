package com.okta.examples;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SomeUtilityClassTest {

    @Test
    public void testAdd() {
        assertThat(SomeUtilityClass.add(0, 1), is(1));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAddWithNull() {
        SomeUtilityClass.add(null, 1);
    }
}
