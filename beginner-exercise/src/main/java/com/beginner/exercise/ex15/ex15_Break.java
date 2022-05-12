package com.beginner.exercise.ex15;


/**
 * break命令
 *
 * break命令は、現在のループを強制的に中断。
 * 「ex11_Switch」で、switchブロックを抜けるための命令と説明したが、
 * 一般的にはwhile/do...while、for、拡張forなどのループの中で利用。
 * また、break命令はifのような条件分岐命令と合わせて利用するのが一般的。
 * ※無条件にbreakすると、ループが1回しか実行されない可能性あり。
 *
 */

public class ex15_Break {
    public static void main(String[] args){
        /* sample1: */
        System.out.println("sample1：" + sample1());
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
    }

    /**
     * sample1　break命令
     *
     * 合計が500を超えるのに、1〜いくつの値を加算した時か出力。
     * for文の継続条件式は100以下だが、sumが500を超えたタイミングでfor文を抜ける。
     *
     * @return String message 合計500を迎えるのは、1〜32を加算したときです。
     *
     */
    public static String sample1(){
        int i = 1;
        int sum = 0;
        String message = "";

        for(i=1;i<=100;i++)
        {
            sum += i;
            if(sum > 500){
                break;
            }
        }

        return message = "合計500を迎えるのは、1〜"+i+"を加算したときです。";
    }

    /**
     * lesson1
     *
     * @retrun String message ハトが出力されました。
     *
     */
    public static String lesson1(){
        /*
          @TODO 拡張for文で、特定の値を出力したタイミングでbreakさせなさい。
         *      配列："イヌ","ネコ","カメ","ハト","カエル"
         *      break条件：ハト出力時
         */

        String message = "";

        return message;
    }

}
