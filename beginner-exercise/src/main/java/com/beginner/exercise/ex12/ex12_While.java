package com.beginner.exercise.ex12;


/**
 * while / do...while命令
 *
 * while / do...while命令は与えられた条件式がtrue(真)である間、配下の処理を繰り返す。
 *
 */

public class ex12_While {
    public static void main(String[] args){
        /* sample1: */
        System.out.println("sample1：" + sample1());
        /* sample2: */
        System.out.println("sample2：" + sample2());
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
    }

    /**
     * sample1　while命令
     *
     * ループ毎に変数を加算し、最終結果を表示するwhile命令。
     * 条件とするiを加算しないと、無限ループとなり終了しないため注意。
     *
     * @return String message (while)は6回ループしました
     *
     */
    public static String sample1(){
        int i = 1;
        String message = "";

        while(i < 6)
        {
            i++;
        }

        message = "(while)は"+i+"回ループしました";
        return message;
    }

    /**
     * sample2　do...while命令
     *
     * ループ毎に変数を加算し、最終結果を表示するdo...while命令。
     * sample1と同様に、条件とするiを加算しないと、無限ループとなり終了しないため注意。
     *
     * @return String message (do...while)は6回ループしました
     *
     */
    public static String sample2(){
        int i = 1;
        String message = "";

        do
        {
            i++;
        }while(i < 6);

        message = "(do...while)は"+i+"回ループしました";
        return message;
    }

    /**
     * lesson1
     *
     * @retrun int any 10に最も近い3の倍数
     *
     */
    public static int lesson1(){
        /*
          @TODO 10までループを回し、if文を利用して、最も10に近い3の倍数を表示させなさい。
         *      ※while、do...while命令のどちらでも構いません。
         */

        return 0;
    }

}
