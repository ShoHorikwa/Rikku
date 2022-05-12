package com.beginner.exercise.ex04;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

public class ex04_CharLiteralTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex04_CharLiteral());

    @Test
    public void Lesson1の確認を行う() {executionHooks.testExecutor("lesson1", "You are \"Great\" Player!");}

    @Test
    public void Lesson2の確認を行う() {executionHooks.testExecutor("lesson2", "あいうえお\nかきくけこ");}

}
