package view;

import java.util.Scanner;

public class ViewUtil {
    public static void terminate() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("キーボード入力を受け付けるとメインメニューに戻ります");
        while(scanner.next().isEmpty()) {}
        MainView mainView = new MainView();
    }
}
