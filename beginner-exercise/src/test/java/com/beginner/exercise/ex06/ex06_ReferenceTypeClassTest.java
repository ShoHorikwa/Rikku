package com.beginner.exercise.ex06;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex06_ReferenceTypeClassTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex06_ReferenceTypeClass());

    @Test
    public void Lesson1の確認を行う() {executionHooks.testExecutor("lesson1", "こんにちは、世界");}

}
