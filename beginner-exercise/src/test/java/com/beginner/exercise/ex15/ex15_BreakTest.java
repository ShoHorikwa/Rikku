package com.beginner.exercise.ex15;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex15_BreakTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex15_Break());

    @Test
    public void lesson1の確認を行う(){executionHooks.testExecutor("lesson1", "ハトが出力されました。");}

}
