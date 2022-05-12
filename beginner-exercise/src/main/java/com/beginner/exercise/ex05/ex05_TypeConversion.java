package com.beginner.exercise.ex05;

/**
 * 型変換
 *
 * javaは型変換を厳密に行う言語。
 * 下記のような場合には、intからStringには変換できずに
 * コンパイルエラーとなる。
 * int num = 108;
 * String str = num; >>エラーになる
 *
 * javaの場合型キャスト(キャスト)構文を使用して、
 * 明示的に変換を行う。
 * (データ型)　変数
 * int i = 13;
 * byte b = (byte)i;
 *
 */
public class ex05_TypeConversion {
    public static void main(String[] args) {
        /* lesson1: */
        System.out.println("lesson1:" + lesson1());
    }


    /**
     * lesson1
     *
     * 文字列を数値型に変換して返却しなさい。
     * @return int any 233
     */

    private static int lesson1() {
        String strNumber = "233";
        /* @TODO 文字列を数値型に変換して返却しなさい。*/
        return  0;
    }
}
