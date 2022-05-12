package com.beginner.exercise.ex12;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex12_WhileTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex12_While());

    @Test
    public void lesson1の確認を行う(){executionHooks.testExecutor("lesson1", 9);}

}
