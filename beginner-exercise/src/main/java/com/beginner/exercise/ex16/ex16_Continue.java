package com.beginner.exercise.ex16;


/**
 * Continue命令
 *
 * 「ex15_Break」で説明したbreak文はループを完全に抜ける。
 * breakに対して現在の周回だけをスキップし、
 * ループそのものは継続して実行するのがcontinue命令。
 *
 */

public class ex16_Continue {
    public static void main(String[] args){
        /* sample1: */
        System.out.println("sample1：" + sample1());
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
    }

    /**
     * sample1　continue命令
     *
     * iが偶数の場合はcontinueで合計をスキップし、
     * 奇数の場合は合計に加算。
     *
     * @return String message 合計値は、2500です。
     *
     */
    public static String sample1(){
        int sum = 0;
        String message = "";

        for(int i=1; i<=100; i++)
        {
            if(i % 2 == 0)
            {
                continue;
            }
            sum += i;
        }

        message = "合計値は、"+sum+"です。";
        return message;
    }

    /**
     * lesson1
     *
     * @retrun String message イヌ、ネコ、ハト、カエル
     */
    public static String lesson1(){
        /*
          @TODO 拡張for文で、”カメ”の場合は出力をスキップするプログラムを書き、カメ以外の値を表示させてください。
         *      配列："イヌ","ネコ","カメ","ハト","カエル"
         *      break条件：カメの場合
         */

        String message = "";

        return message;
    }

}
