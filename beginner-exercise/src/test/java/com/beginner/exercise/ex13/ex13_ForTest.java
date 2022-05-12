package com.beginner.exercise.ex13;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex13_ForTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex13_For());

    @Test
    public void lesson1の確認を行う(){executionHooks.testExecutor("lesson1", 8);}

}
