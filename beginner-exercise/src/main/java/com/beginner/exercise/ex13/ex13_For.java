package com.beginner.exercise.ex13;


/**
 * for命令
 *
 * 条件式の真偽によってループを制御する while / do...while命令に対して、
 * for命令はあらかじめ指定された回数だけ処理を繰り返す。
 *
 */

public class ex13_For {
    public static void main(String[] args){
        /* sample1: */
        System.out.println("sample1：" + sample1());
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
    }

    /**s
     * sample1　for命令
     *
     * 5までの数字を表示するfor命令。
     * 「ex12_While sample1,2」をfor命令で書き換えたもの。
     * 　※for命令でも無限ループを発生させることが出来るので注意。
     *
     * 下記はfor文の説明。
     * int i = 1;
     * 　→初期化式。
     * 　　初期化式は、forブロックの最初のループで1度だけ実行。
     * 　　一般的に、ここでカウンター変数（ループ変数）を初期化。
     * 　　カウンター変数は、for命令によるループ回数を管理する変数。
     *
     * i<6;
     *  →継続条件式。
     *  　継続条件式は、forループを継続するための条件。
     *  　ループを開始するたびに判定し、条件を満たさなくなったタイミングでforブロックを終了。
     *
     * i++;
     * 　→増減式。
     * 　　ループ内の処理が1回終わるたびに実行。
     * 　　一般的には、カウンター変数を増減するためのインクリメント/デクリメント、
     * 　　複合代入演算子で表す。
     *
     * @return String message (for)は5回ループしました
     *
     */
    public static String sample1(){
        int number = 0;
        String message = "";

        for(int i = 1; i<6; i++)
        {
            number = i;
        }

        message = "(for)は"+number+"回ループしました";
        return message;
    }

    /**
     * lesson1
     *
     *　@retrun int any 10に最も近い4の倍数
     *
     */
    public static int lesson1(){
        /* @TODO 10までループを回し、if文を利用して、最も10に近い4の倍数を表示させなさい。*/

        return 0;
    }
}
