package com.beginner.exercise.ex11;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex11_SwitchTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex11_Switch());

    @Test
    public void lesson1の確認を行う(){executionHooks.testExecutor("lesson1", "Blue");}

    @Test
    public void lesson2の確認を行う(){executionHooks.testExecutor("lesson2", "変温動物です。");}

}
