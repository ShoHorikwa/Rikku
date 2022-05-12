package com.beginner.exercise.ex01;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;


public class ex01_declearVariableTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex01_declearVariable());

    @Test
    public void Lesson1の確認を行う() {executionHooks.testExecutor("lesson1", 1);}

    @Test
    public void Lesson2の確認を行う() {executionHooks.testExecutor("lesson2", "こんにちは！hello");}

}
