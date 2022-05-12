package controller;

import port.MainViewPort;
import view.BookSelectView;
import view.AuthorSelectView;
import view.ExtractView;
import view.VagueSelectView;

public class MainViewController implements MainViewPort {
    @Override
    public void controller(String scanner) throws Exception {
        switch (scanner) {
            case "1":
                new BookSelectView();
            case "2":
                new AuthorSelectView();
            case "3":
                new VagueSelectView();
            default:
                new ExtractView(scanner);

        }
    }
}
