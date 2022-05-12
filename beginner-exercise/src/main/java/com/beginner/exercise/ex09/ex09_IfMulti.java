package com.beginner.exercise.ex09;


/**
 * if命令
 *
 * ここまでのプログラムは、記述された順に処理を実行していくだけ。
 * しかし、実際のアプリでは、ユーザーからの入力値や実行環境、その他の条件によって、
 * 処理を切り替えるのが一般的。
 *
 */

/**
 * 多岐分岐
 *
 * else ifは条件に合致する最初のブロックのみ実行され、
 * それ以降のブロックは無視される。
 * そのため、else ifを利用する場合は
 * else ifブロックを利用することで、
 * 「もしも〇〇だったら・・・、□□であれば・・・」という多岐分岐も表現可能。
 *
 */


public class ex09_IfMulti {
    public static void main(String[] args){
        /* sample1: */
        System.out.println("sample1：" + sample1());
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
        /* lesson2: */
        System.out.println("lesson2：" + lesson2());
    }

    /**
     * sample1　if命令　多岐分岐
     *
     * 変数iの値が100以上の場合に「変数iは50より大きいです。」というメッセージを、
     * 100以下、30以上の場合に「変数iは30より大きく、50以下です。」というメッセージを、
     * そうでなかった（変数iが30以下）場合に「変数iは30以下です。」
     * というメッセージを表示。
     *
     * 最初のifブロックで合致するため、
     * その後のelse ifは実行されない。
     *
     * @retrun String message if分岐の結果によって文言を編集
     *
     */
    public static String sample1(){
        int i = 100;
        String message = "";
        if(i >= 100){
            message = "変数iは50より大きいです。";
        }else if(i > 30){
            message = "変数iは30より大きく、50以下です。";
        }else{
            message = "変数iは30以下です。";
        }
        return message;
    }

    /**
     * lesson1
     *
     *  return String any if分岐の結果によって文言を編集
     */
    public static String lesson1(){
        /* @TODO 上記sample1のプログラムをコピーし、「変数iは30より大きく、50以下です。」と表示するよう書き換えてなさい。 */
        return "";
    }

    /**
     * lesson2
     *
     * return String any if分岐の結果によって文言を編集
     */
    public static String lesson2(){
        /* @TODO 下記要件を満たすプログラムを書いて、「B」を表示させなさい。 */
        /* @TODO 要件：もしも変数iが100なら「A」、変数iが100未満、70以上なら「B」、変数iが70未満、30以上なら「C」、さもなくば、×を表示 */
        return "";
    }
}
