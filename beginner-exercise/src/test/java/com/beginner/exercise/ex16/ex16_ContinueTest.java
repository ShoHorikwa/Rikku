package com.beginner.exercise.ex16;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex16_ContinueTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex16_Continue());

    @Test
    public void lesson1の確認を行う(){executionHooks.testExecutor("lesson1", "イヌ、ネコ、ハト、カエル");}

}
