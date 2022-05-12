package com.beginner.exercise.ex14;


/**
 * 拡張for命令
 *
 * 拡張forは、指定された配列やコレクションの要素を取り出して先頭から順番に処理。
 * ※sample2は引数を利用するため、実行構成にて佐藤 田中 近藤を設定しておくこと。
 *
 */

public class ex14_ForEach {
    public static void main(String[] args){
        /* sample1: */
        System.out.println("sample1：" + sample1());
        /* sample2: */
        System.out.println("sample2：" + sample2(args));
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
    }

    /**
     * sample1　拡張for命令
     *
     * 配列に格納した値を、仮変数に一時的に格納して個々の要素にアクセス。
     *
     * @return String animals イヌ、ネコ、カメ
     *
     */
    public static String sample1(){
        String animals = "";

        String[] data = new String[] {"イヌ","ネコ","カメ"};

        for(String value: data)
        {
            animals = animals + value + "、";
        }

        //  末尾の読点を削除
        animals = animals.substring(0, animals.length()-1);

        return animals;
    }

    /**
     * sample2　拡張for命令(引数がある場合)
     *
     * 引数argsで受け取った値を表示。
     * ※引数argsは実行構成にて 佐藤 田中 近藤 を設定。
     *
     * @return String names 佐藤、田中、近藤
     *
     */
    public static String sample2(String[] args){
        String names = "";

        for(String value: args)
        {
            names = names + value + "、";
        }

        //  末尾の読点を削除
        names = names.substring(0, names.length()-1);

        return names;
    }

    /**
     * lesson1
     *
     * @retrun int any 5
     *
     */
    public static int lesson1(){
        /* @TODO 数値の1から10を配列に格納し5のみ表示させなさい。*/

        return 0;
    }
}
