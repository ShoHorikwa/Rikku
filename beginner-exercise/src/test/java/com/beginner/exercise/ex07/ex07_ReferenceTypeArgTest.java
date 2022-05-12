package com.beginner.exercise.ex07;

import com.beginner.exercise.ExecutionHooks;
import org.junit.Test;

import java.util.Arrays;

public class ex07_ReferenceTypeArgTest {
    ExecutionHooks executionHooks = new ExecutionHooks(new ex07_ReferenceTypeArg());

    @Test
    public void Lesson1の確認を行う() {
        executionHooks.testExecutor("lesson1", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    @Test
    public void Lesson2の確認を行う() {
        executionHooks.testExecutor("lesson2", lesson2_expected());
    }

    public String lesson2_expected(){
        int[][] expecteds = new int[2][];
        expecteds[0] = new int[5];
        expecteds[1] = new int[5];

        expecteds[0][0] = 1;
        expecteds[0][1] = 2;
        expecteds[0][2] = 3;
        expecteds[0][3] = 4;
        expecteds[0][4] = 5;
        expecteds[1][0] = 6;
        expecteds[1][1] = 7;
        expecteds[1][2] = 8;
        expecteds[1][3] = 9;
        expecteds[1][4] = 10;
        return Arrays.deepToString(expecteds);
    }
}
