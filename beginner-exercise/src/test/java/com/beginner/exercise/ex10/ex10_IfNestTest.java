package com.beginner.exercise.ex10;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex10_IfNestTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex10_IfNest());

    @Test
    public void lesson1の確認を行う(){executionHooks.testExecutor("lesson1", "C");}

}
