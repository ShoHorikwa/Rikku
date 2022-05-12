package com.beginner.exercise.ex09;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex09_IfMultiTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex09_IfMulti());

    @Test
    public void lesson1の確認を行う(){executionHooks.testExecutor("lesson1", "変数iは30より大きく、50以下です。");}

    @Test
    public void lesson2の確認を行う(){executionHooks.testExecutor("lesson2", "B");}
}
