package com.beginner.exercise.ex06;

/**
 * クラス型
 *
 * ex06_RefelenceTypeClass用の呼び出し元クラスです。
 */
public class InstanceSample {

    /**
     * helloWorld
     *
     * メッセージを設定し、画面に表示します。
     *
     * ※戻り値なし
     * @return
     */
    public void helloWorld() {
        String printHello = "Hello World";
        System.out.println(printHello);
    }


    /**
     * getName
     *
     * ※戻り値あり
     * @return String output こんにちは、世界
     *
     */
    public String getName() {
        String output = "こんにちは、世界";
        return output;
    }
}
