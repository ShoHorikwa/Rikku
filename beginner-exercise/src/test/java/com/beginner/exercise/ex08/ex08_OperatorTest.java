package com.beginner.exercise.ex08;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex08_OperatorTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex08_Operator());

    @Test
    public void lesson1の確認を行う(){executionHooks.testExecutor("lesson1", true);}

    @Test
    public void lesson2の確認を行う(){executionHooks.testExecutor("lesson2", true);}

    @Test
    public void lesson3の確認を行う(){executionHooks.testExecutor("lesson3", true);}
}
