package com.beginner.exercise.ex08;

import java.util.Arrays;

/**
 * 演算子(オペレーター)
 * 与えられた変数やリテラルに対して、
 * 決められた処理を行うための記号。
 * これまでも、右辺の値を左辺の変数に代入する=演算子や、
 * 数値を加算する+演算子などが登場済み。
 * （javaの演算子）
 * ・算術演算子
 * ・代入演算子
 * ・関係演算子
 * ・論理演算子
 * ・ビット演算子
 *
 */
public class ex08_Operator {
    public static void main(String[] args) {
        /* sample1: */
        System.out.print("sample1：");
        sample1();
        /* sample2: */
        System.out.println("sample2：");
        sample2();
        /* sample3: */
        System.out.println("sample3：");
        sample3();
        /* sample4: */
        System.out.println("sample4：");
        sample4();
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
        /* lesson2: */
        System.out.println("lesson2：" + lesson2());
        /* lesson3: */
        System.out.println("lesson3：" + lesson3());
    }

    /**
     * sample
     * 算術演算子。加算。
     *
     * @return
     */
    private static void sample1() {

        /*　加算　*/
        int addResult = 2 + 3;
        System.out.println(addResult);
        /* 減算 */
        int subtractionResult = 5 - 3;
        System.out.println(subtractionResult);
        /* 乗算 */
        int multiplicationResult = 3 * 4;
        System.out.println(multiplicationResult);
        /* 除算 */
        int divisionResult = 5 / 2;
        System.out.println(divisionResult);
        /* 剰余（割った余り） */
        int surplus = 5 % 2;
        System.out.println(surplus);
        /*　前置加算（代入前に加算） */
        int i = 3;
        int j = ++i;
        System.out.println(j);
        /* 後置加算（代入後に加算） */
        int k = 3;
        int l = k++;
        System.out.println(l);
        /*　前置減算（代入前に減算） */
        int m = 3;
        int n = --m;
        System.out.println(n);
        /* 後置減算（代入後に減算） */
        int o = 3;
        int p = o--;
        System.out.println(p);



        /* 非数値が存在する場合 */
        System.out.println("a" + 5);
        System.out.println("1" + "2");
    }


    private static void sample2() {
        /* 左辺と右辺が正しい場合はtrue */
        System.out.println((5==5));
        /* 左辺と右辺が正しくない場合にtrue */
        System.out.println((5 != 5));
        /* 左辺が右辺より値が小さい場合にtrue */
        System.out.println((5 < 10));
        /* 左辺が右辺より値が大きい場合にtrue */
        System.out.println((5 > 10));
        /* 左辺が右辺以下の場合にtrue */
        System.out.println((4 <= 10));
        /* 左辺が右辺以上の場合にtrue */
        System.out.println((4 >= 10));
        /* 条件演算子「条件式 ? 式1 : 式2」。条件式がtrueの場合は式1、falseの場合は式2 */
        System.out.println(( 5 > 10 ? "正解" : "不正解"));
    }

    /**
     * 関係演算子
     *
     * 条件式 ? 式１：式2
     */
    private static void sample3() {
        /* ageが20以上の時に大人を返却する関係演算子 */
        var age = 30;
        System.out.println(age > 20 ? "大人":"子供");
    }

    /**
     * 論理演算子
     */
    private static void sample4() {
        /* trueを返却する式 */
        boolean x1  =  ("a".equals("a") ? true : false);
        /* falseを返却する式 */
        boolean x2  =  ("a".equals("b") ? true : false);

        /* 論理積。左右の式が共にtrueの場合true */
        System.out.println(x1 && x1 );
        /* 論理和。左右の式がどちらかがtrueの場合true */
        System.out.println(x1 || x2);
        System.out.println(x1 || x1);
        System.out.println(x2 || x1);

        /* 否定。式がtrueの場合はfalse,trueの場合はfalseを返却する */
        System.out.println(!x1);
        System.out.println(!x2);

    }


    /**
     * ショートカット演算子
     *
     */

    /**
     * lesson1
     *
     * @return boolean
     */
    private static boolean lesson1() {
        /* @TODO 変数sb1,sb2を=で比較し、trueを返却すること*/
        StringBuilder sb1 = new StringBuilder("テスト");
        StringBuilder sb2 = null;

        return sb1==sb2;
    }

    /**
     * lesson2
     *
     */
    private static boolean lesson2() {
        /* @TODO trueを返却すること */
        String str1 = "あいう";

        return (str1 == ("" +  ""));
    }

    /**
     * lesson3
     * 配列の比較
     *
     */
    private static boolean lesson3() {
        String[] strList1 = {"あ","い","う"};
        String[] strList2 = {"あ","い","う"};


        /* @TODO trueを返却すること */
        return  strList1.equals(strList2);
    }
}
