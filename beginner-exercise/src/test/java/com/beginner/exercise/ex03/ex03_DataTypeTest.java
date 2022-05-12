package com.beginner.exercise.ex03;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex03_DataTypeTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex03_DataType());

    @Test
    public void Lesson1の確認を行う() {executionHooks.testExecutor("lesson1", 124);}
    @Test
    public void Lesson2の確認を行う() {executionHooks.testExecutor("lesson2", 1.08);}
    @Test
    public void Lesson3の確認を行う() {executionHooks.testExecutor("lesson3", "こんにちは");}
    @Test
    public void Lesson4の確認を行う() {executionHooks.testExecutor("lesson4", false);}

}
