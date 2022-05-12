import view.MainView;

public class ConsoleApp {
    public static void main(String[] args) {
        try {
            new MainView();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
