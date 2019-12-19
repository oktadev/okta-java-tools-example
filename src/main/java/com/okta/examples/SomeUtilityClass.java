package com.okta.examples;

public final class SomeUtilityClass {

    private SomeUtilityClass() {}

    public static int add(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Arguments must not be null.");
        }
        return Math.addExact(a, b);
    }
}
