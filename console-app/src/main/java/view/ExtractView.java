package view;

import usecase.ExtractUseCase;

import java.util.Scanner;

public class ExtractView {
    public ExtractView(String scanner) throws Exception {
        ExtractUseCase extractUseCase = new ExtractUseCase(scanner);
        extractUseCase.restartApp();
        createExtractView();
    }

    private void createExtractView() throws Exception  {
        MainView mainView = new MainView();
    }
}
