package com.beginner.exercise.ex08;

/**
 * if命令
 *
 * ここまでのプログラムは、記述された順に処理を実行するだけ。
 * しかし、実際のアプリは、ユーザーからの入力値や実行環境、その他の条件によって、
 * 処理を切り替えるのが一般的。
 *
 */

import java.util.Arrays;

/**
 * 単純分岐
 *
 * ifは、与えられた条件がtrue/falseいずれであるかによって、
 * 実行すべき処理を決める命令。
 * その名の通り、「もし〜だったら、・・・さもなくば・・・」
 * という構造を表現。
 *
 */

public class ex08_IfSimple {
    public static void main(String[] args){
        /* sample1: */
        System.out.println("sample1：" + sample1());
        /* sample2: */
        System.out.println("sample2：" + sample2());
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
        /* lesson2: */
        System.out.println("lesson2：" + lesson2());
    }

    /**
     * sample1　if命令　単純分岐
     *
     * 変数iの値が10であった場合に「変数iは10です。」というメッセージを、
     * そうでなかった（変数iが10でない）場合に「変数iは10ではありません」
     * というメッセージを表示。
     *
     * 指定された条件式がtrueである場合は、その直後のブロックを、
     * falseである場合にはelse以降のブロックを、それぞれ選択して実行。
     * ※ブロックは{...}で囲まれた部分
     *
     * @return String ans if分岐の結果によって文言を編集
     *
     */
    public static String sample1(){

        int i = 10;
        String ans = "";
        if(i == 10){
            ans = "変数iは10です。";
        }else{
            // else文は省略可能
            ans = "変数iは10ではありません。";
        }
        return ans;
    }

    /**
     * sample2　if命令　単純分岐
     *
     * 変数iが10のときだけ処理を実行したい場合はelseを省略可能。
     *
     * @return String equal_test if分岐の結果によって文言を編集
     *
     */
    public static String sample2(){

        int i = 10;
        String equal_test = "";
        if(i == 10){
            equal_test = "変数iは10です。";
        }
        return equal_test;
    }

    /**
     * lesson1
     *
     * @return String any 変数は10以上です。
     *
     */
    public static String lesson1(){
        /* @TODO 変数の値が10以上の場合、「変数は10以上です。」と表示するプログラムを書きなさい。*/
        return "";

    }

    /**
     * lesson2
     *
     * @return String any 条件に合致しませんでした。
     *
     */
    public static String lesson2(){
        /* @TODO  else文に遷移させ、「条件に合致しませんでした。」と表示するプログラムを書きなさい。*/
        return "";
    }
}
