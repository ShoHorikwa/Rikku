package usecase;

import controller.MainViewController;
import port.MainViewPort;

public class MainViewUseCase {
    private String scanner;

    public MainViewUseCase(String scanner) {
        this.scanner = scanner;
    }
    public void controller() throws Exception {
        MainViewPort mainViewPort = new MainViewController();
        mainViewPort.controller(scanner);
    }

}
