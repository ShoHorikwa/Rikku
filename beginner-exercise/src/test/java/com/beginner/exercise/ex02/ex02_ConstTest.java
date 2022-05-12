package com.beginner.exercise.ex02;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex02_ConstTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex02_Const());

    @Test
    public void Lesson1の確認を行う() {executionHooks.testExecutor("lesson1", 1296.0);}
}
