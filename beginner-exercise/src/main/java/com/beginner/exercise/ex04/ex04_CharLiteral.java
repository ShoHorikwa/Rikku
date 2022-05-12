package com.beginner.exercise.ex04;

/**
 * 文字列リテラル
 * 文字列内に「"」が含まれる文字列を取り扱う場合、
 * String samplChar = "hello "World"!"だと、
 * 文字列リテラルの間に不明な識別子「"」があるとみなされ、
 * コンパイルエラーが発生する。
 *　そういった場合はエスケープシーケンスを利用する。
 *
 *
 */
public class ex04_CharLiteral {
    public static void main(String[] args) {

        /* sample1: */
        System.out.println("sample1：" + sample1());
        /* sample2: */
        System.out.println("sample2：" + sample2());
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
        /* lesson2: */
        System.out.println("lesson2：" + lesson2());

    }

    private static String sample1() {
        /* エスケープ：下記例だとコンパイルエラー */
        //String errChar = "hello "World"!";

        /* エスケープ：正 */
        String okChar = "hello \"World¥\"!";

        return okChar;
    }


    private static String sample2() {
        /* 改行 */
        //String miss = "アイウエ
        // オ";

        /* ,改行：正 */
        String ok = "アイウエ\nオ";

        return  ok;
    }



    /**
     * lesson1
     *
     *
     * @return String any 「You are "Great" Player!」
     */
    private static String lesson1(){

        /* @TODO You are "Great" Player! という文字列を戻り値として設定しなさい(変数名は自由)*/
        return "";
    }



    /**
     * lesson2

     * ※ か行については、改行されて表示されていること。
     * @return String any あいうえお(改行) かきくけこ
     */
    private static String lesson2(){

        /* @TODO  「あいうえお(改行) かきくけこ」　という文字列を戻り値として設定しなさい(変数名は自由)*/
        return "";
    }

}

