package com.beginner.exercise.ex14;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex14_ForEachTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex14_ForEach());

    @Test
    public void lesson1の確認を行う(){executionHooks.testExecutor("lesson1", 5);}

}
