package com.beginner.exercise.ex01;

/**
 *
 * 変数とはデータの入れ物。
 * 変数の利用にあたっては変数の宣言をしなければならない。
 * 変数の宣言とは変数の名前をjavaに通知し、
 * 値を格納するための領域をメモリに確保
 */
public class ex01_declearVariable {

    public static void main(String[] args) {
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
        /* lesson2: */
        System.out.println("lesson2：" + lesson2());

    }


    /**
     * lesson1
     * int(整数値)を入れるためのdataという名前の変数を準備しなさい
     * @return data 1
     */
    private static int lesson1() {
        return 4;
    }
    /**
     * lesson2
     * String(文字列)を入れるためのmessageという変数を準備し、
     * 「こんにちは！hello!」を返却しなさい
     * @return  message こんにちは！hello
     */
    private static String lesson2() {
        return  "";
    }

}
