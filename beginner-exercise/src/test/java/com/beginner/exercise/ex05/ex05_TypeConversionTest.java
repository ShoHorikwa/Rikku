package com.beginner.exercise.ex05;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex05_TypeConversionTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex05_TypeConversion());

    @Test
    public void Lesson1の確認を行う() {executionHooks.testExecutor("lesson1", 233);}

}
