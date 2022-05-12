package view;
import usecase.MainViewUseCase;

import java.util.Scanner;

public class MainView {

    public MainView() throws Exception {
        Scanner scanner = new Scanner(System.in);
        createMainMenuView();
        MainViewUseCase mainViewUseCase = new MainViewUseCase(scanner.next());
        mainViewUseCase.controller();

    }
    private void createMainMenuView() {

        System.out.println();
        System.out.println("------------------");
        System.out.println("書籍検索アプリ");
        System.out.println("------------------");
        System.out.println();
        System.out.println("1) 書籍名から検索");
        System.out.println();
        System.out.println("2) 著者から書籍検索");
        System.out.println();
        System.out.println("3) あいまい検索");
        System.out.println();
        System.out.println("数字を入力して操作を行ってください");
        System.out.print(">");
    }



}
