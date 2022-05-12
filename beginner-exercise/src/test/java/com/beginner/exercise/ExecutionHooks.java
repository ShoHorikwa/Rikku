package com.beginner.exercise;

import org.junit.Assert;

import java.lang.reflect.Method;

public class ExecutionHooks {
    private Object target;

    public ExecutionHooks(Object target) {
        this.target = target;
    }

    public void testExecutor(String targetMethodName, Object expected) {
        try {
            Method method = this.target.getClass().getDeclaredMethod(targetMethodName);
            method.setAccessible(true);
            Object actual = (Object) method.invoke(this.target);
            Assert.assertEquals(expected, actual);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
