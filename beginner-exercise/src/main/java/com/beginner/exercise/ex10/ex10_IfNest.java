package com.beginner.exercise.ex10;


/**
 * if命令
 *
 * ここまでのプログラムは、記述された順に処理を実行していくだけ。
 * しかし、実際のアプリでは、ユーザーからの入力値や実行環境、その他の条件によって、
 * 処理を切り替えるのが一般的。
 *
 */

/**
 * 入れ子構造
 *
 * if命令は、互いに入れ子にすることも可能。
 * 制御命令同士を入れ子にすることをネストすると言う。
 * ネストの深さに制限はないが、コードの読みやすさテストの容易性という意味で、
 * あまりに深いネストは避けること。
 *
 */


public class ex10_IfNest {
    public static void main(String[] args){
        /* sample1: */
        System.out.println("sample1：" + sample1());
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
    }

    /**
     * sample1　if命令　入れ子構造
     *
     * 変数i,jの値が1であれば「変数i、jは1です。」というメッセージを
     * 変数iのみ1であれば、「変数iは1ですが、jは1ではありません。」というメッセージを
     * 変数iが1でない場合は「変数iは1ではありません」というメッセージを表示。
     *
     * @retrun String message if分岐の結果によって文言を編集
     *
     */
    public static String sample1(){
        int i = 1;
        int j = 0;
        String message = "";

        if(i == 1){
            if(j==1){
                message = "変数i、jは1です。";
            }else{
                message = "変数iは1ですが、jは1ではありません。";
            }
        }else{
            message = "変数iは1ではありません。";
        }

        return message;
    }

    /**
     * lesson1
     *
     * @retrun String any C
     */
    public static String lesson1(){
        /* @TODO 下記要件を満たすプログラムを書いて、Cを表示させなさい。 */
        /* @TODO 要件：もしも変数i,jが100なら「A+」、変数iが100、変数jが30以上なら「C」、さもなくば、「×」を表示 */
        return "";
    }
}
