package usecase;

public class ExtractUseCase {
    private String scanner;

    public ExtractUseCase(String scanner) {
        this.scanner = scanner;
    }

    public void restartApp() throws InterruptedException {
        System.out.println("不正な値" + scanner + "が入力されました" );
        System.out.println("1~3を入力し、各画面に遷移してください" );
        Thread.sleep(3000);

    }
}
