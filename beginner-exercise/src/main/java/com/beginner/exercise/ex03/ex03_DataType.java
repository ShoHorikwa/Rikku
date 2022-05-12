package com.beginner.exercise.ex03;


/**
 * データ型
 *
 * プログラムの中で取り扱うデータの種類を示す。
 * 前章で変数宣言、定数宣言時に使用。
 * 具体的には取り扱うデータが数値なのか文字列なのかといった事柄を決めるのが
 * 役割。
 * （主要な型）
 * ・整数型
 * ・浮動小数点型
 * ・文字型
 * ・真偽型
 */
public class ex03_DataType {
    public  static  void main(String[] args) {
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
        /* lesson2: */
        System.out.println("lesson2：" + lesson2());
        /* lesson3: */
        System.out.println("lesson3：" + lesson3());
        /* lesson4: */
        System.out.println("lesson4：" + lesson4());

    }

    /**
     * lesson1(整数型)
     *
     * @return int seisu 124
     */
    private static int lesson1() {

        /*@TODO 変数seisuを宣言をした上で整数型の124で返却しなさい */
        return 9;
    }

    /**
     * lesson2(浮動小数型)
     *
     * @return doubel shosu 1.08
     */
    private static double lesson2() {

        /*@TODO 変数shosuを宣言をした上で浮動小数型の1.08で返却しなさい */
        return 9;
    }

    /**
     * lesson3(文字型)
     *
     * @return String mojiretu こんにちは
     */
    private static String lesson3() {

        /*@TODO 変数mojiretuを宣言をした上で文字型のこんにちはで返却しなさい */
        return "";
    }

    /**
     * lesson4(真偽型)
     *
     * @return boolean shingi false
     */
    private static boolean lesson4() {

        /*@TODO 変数shingiを宣言をした上で真偽型のfalseで返却しなさい */
        return true;
    }
}
