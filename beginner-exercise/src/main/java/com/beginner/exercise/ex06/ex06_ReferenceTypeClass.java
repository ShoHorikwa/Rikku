package com.beginner.exercise.ex06;

/**
 * 参照型
 *
 * javaで扱う大部分は参照型。
 * これまで触れてきたString型も参照型の一部に分類される。
 * （参照型の分類）
 * ・クラス型
 * ・インターフェース型
 * ・配列型
 */

/**
 * クラス型
 * クラスをもとに、具体的なモノを作成する作業をインスタンス化と言う。
 * インスタンス化によってできるモノをオブジェクト、またはインスタンスと呼ぶ。
 * クラスをインスタンス化するためには "new"というキーワードを利用する。
 *
 * インスタンス化の方法
 * クラス名 変数名 = new クラス名();
 */
public class ex06_ReferenceTypeClass {
    public static void main(String[] args){

        /* sample1: */
        System.out.print("sample1：");
        sample1();
        /* sample2: */
        System.out.println("sample2：" + sample2());
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());

    }

    /**
     * sample1
     *
     * メッセージを表示するファンクション実行
     * ※戻り値なし
     * @return
     */
    public static void sample1(){

        InstanceSample instanceSample = new InstanceSample();
        instanceSample.helloWorld();
    }

    /**
     * sample2
     *
     * ※戻り値あり
     * @return String sample_message こんにちは、世界
     */
    public static String sample2(){
        InstanceSample instanceSample = new InstanceSample();
        String sample_message = instanceSample.getName();
        return sample_message;
    }

    /**
     * lesson1
     *
     * ※戻り値あり
     * @return String message こんにちは、世界
     */
    public static String lesson1(){
        /*@TODO 1.呼び出し先（InstanceSample.java）　　 ：getNameファンクションに変数outputを宣言した上で文字列型の「こんにちは、世界」で返却しなさい。 */
        /*@TODO 2.呼び出し元（ex06_ReferenceType.java）：InstanceSampleをインスタンス化して呼び出し、変数messageにgetNameの結果を格納して返却しなさい */
        return "";
    }
}
