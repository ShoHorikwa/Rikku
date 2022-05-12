package com.beginner.exercise.ex08;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex08_IfSimpleTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex08_IfSimple());

    @Test
    public void Lesson1の確認を行う() { executionHooks.testExecutor("lesson1", "変数は10以上です。"); }

    @Test
    public void Lesson2の確認を行う() {
        executionHooks.testExecutor("lesson2", "条件に合致しませんでした。");
    }
}
