package com.beginner.exercise.ex02;


/**
 * 定数
 *
 * 前章で説明した変数とはデータの入れ物であり、
 * コードの途中で値の変更も可能だが、
 * 一方で値を変更できないものを定数と呼ぶ。
 *
 */
public class ex02_Const {
    public  static  void main(String[] args) {
        /* sample */
        System.out.println("sample：" + sample());
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());

    }

    /**
     * sample
     *
     * 税抜きの価格priceに対して税率1.08を乗算した例です。
     * 下記コードには下記問題点が考えられる。
     * ・値の意味が曖昧である。
     * >>1.08は誰にでも理解できる値ではない。（値上げ率なのかサービス料金か曖昧）
     * ・値の修正に弱い
     * >>消費税率が10%,25%に変化または、コード内に1.08の値が散見される場合、
     * 値を漏れなく検索/修正する作業が必要。
     *
     * @return
     */
    private static double sample() {
        int price = 1200;
        double priceCaluculated = price * 1.08;

        return  priceCaluculated;
    }

    /**
     * lesson1
     * TAXという定数を定義した上で,上記sampleと同じ結果を返却する
     * ように修正を行いなさい
     *
     * 定数の宣言：
     *
     * final データ型 定数名 = 値;
     * (example)
     * final double TAX = 1.05;
     *
     *
     * @return priceCalculated
     */
    private static double lesson1() {
        int price = 1200;
        /* @TODO 1.08の定数化を行った上で計算すること */
        double priceCaluculated = price * 1.00;

        return  priceCaluculated;
    }

}
