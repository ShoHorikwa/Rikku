package com.beginner.exercise.ex07;

/**
 * 参照型
 *
 * javaで扱う大部分は参照型。
 * これまで触れてきたString型も参照型の一部に分類される。
 * （参照型の分類）
 * ・クラス型
 * ・インターフェース型
 * ・配列型
 *
 */

/**
 * 配列型
 *
 * 処理によっては複数の値をまとめて扱いたいケースもよくある。
 * その場合は配列を使う。
 * 配列には複数の値を納めることが出来る。
 * 配列は、仕切りのある入れ物。
 * 仕切りで区切られたスペース（要素）のそれぞれに番号が振られているため、識別可能。
 *
 * 配列変数を表示する場合、以下をimport
 * import java.util.Arrays;
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex07_ReferenceTypeArg {
    public static void main(String[] args){
        /* sample1: */
        System.out.println("sample1：" + Arrays.toString(sample1()));
        /* sample2: */
        System.out.println("sample2：" + Arrays.deepToString(sample2()));
        /* lesson1: */
        System.out.println("lesson1：" + lesson1());
        /* lesson2: */
        System.out.println("lesson2：" + lesson2());

    }

    /**
     * sample1　配列　取り出し
     * 配列変数を表示する場合は、「Arrays.toString」を使用
     *
     * @return int[] lists [1,2,3]
     *
     */
    public static int[] sample1(){

        // 初期値を伴う宣言をする場合
        int[] lists = {1,2,3};

        return lists;
    }

    /**
     * sample2　２次元配列　取り出し
     *
     * @return int[][] nums [87,58,72], [74,92,89]
     *
     */
    public static int[][] sample2(){
        int[][] nums = new int[2][];
        nums[0] = new int[3];
        nums[1] = new int[3];

        nums[0][0] = 87;
        nums[0][1] = 58;
        nums[0][2] = 72;

        nums[1][0] = 74;
        nums[1][1] = 92;
        nums[1][2] = 80;

        return nums;
    }

    /**
     * lesson1
     *
     * @return integer numbers 1,2,3,4,5,6,7,8,9,10
     */
    public static List<Integer> lesson1(){
        /* @TODO リスト型 numbersに1〜10の数字を入れ、表示するプログラムを書きなさい。*/
        List<Integer> numbers = new ArrayList<Integer>();
        return numbers;
    }

    /**
     * lesson2
     *
     *  @return String tazigen [1,2,3,4,5],[6,7,8,9,10]
     */
    public static String lesson2(){
        /* @TODO 多次元配列で、1〜5、6〜10の数字を入れ、表示するプログラムを書きなさい。*/
        int[][] tazigen = new int[2][];
        tazigen[0] = new int[5];
        tazigen[1] = new int[5];

        return Arrays.deepToString(tazigen);
    }

}
