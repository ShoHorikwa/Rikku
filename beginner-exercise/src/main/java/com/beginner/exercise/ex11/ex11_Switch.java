package com.beginner.exercise.ex11;


/**
 * switch命令
 *
 * switch命令は「等価演算子(==)による多岐分岐」に特化した条件分岐命令。
 * switch命令を利用することで、同じような式を繰り返し記述する必要がなくなる。
 * そのため、無駄なコードが減り読みやすくなる。
 *
 * また、switchを明示的に抜ける場合は、「break;」を記載。
 *
 */

public class ex11_Switch {
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
     * sample1　switch文
     *
     * rankが甲の場合に「一番です。」というメッセージを、
     * 乙の場合に「二番です。」というメッセージを、
     * 丙の場合に「三番です。」というメッセージを、
     * それ以外の場合は「ランク外です。」というメッセージを表示。
     *
     * @return String message 一番です。
     *
     */
    public static String sample1(){
        String rank = "甲";
        String message = "";

        switch(rank){
            case "甲":
                message = "一番です。";
                break;
            case "乙":
                message = "二番です。";
                break;
            case "丙":
                message = "三番です。";
                break;
            default:
                message = "ランク外です。";
                break;
        }

        return message;
    }

    /**
     * sample2　switch文
     *
     * animalがイヌ、クジラ、イルカの場合に「ホニュウ類です。」というメッセージを、
     * スズメ、ハト、ペンギンの場合は「鳥類です。」というメッセージを表示。
     *
     * @return String message 鳥類です。
     *
     */
    public static String sample2(){
        String animal = "スズメ";
        String message = "";

        switch(animal){
            case "イヌ":
            case "クジラ":
            case "イルカ":
                message = "ホニュウ類です。";
                break;
            case "スズメ":
            case "ハト":
            case "ペンギン":
                message = "鳥類です。";
                break;
        }

        return message;
    }

    /**
     * lesson1
     *
     * @retrun String any Blue
     *
     */
    public static String lesson1(){
        /*
          @TODO 下記要件を満たすプログラムを書き、「Blue」を表示させなさい。
         *  赤の場合は「Red」、
         *  青の場合は「Blue」、
         *  黄の場合は「Yellow」を表示。
         */

        return "";
    }

    /**
     * lesson2
     *
     * @retrun String any 変温動物です。
     *
     */
    public static String lesson2(){
        /*
          @TODO 下記要件を満たすプログラムを書き、「変温動物です。」を表示させなさい。
         *  カメ、ワニ、イモリの場合は「変温動物です。」、
         *  イヌ、ペンギン、ウサギの場合は「恒温動物です。」を表示。
         */

        return "";
    }
}
