package view;

import domein.Book;
import usecase.VagueSelectUseCase;

import java.util.List;
import java.util.Scanner;

public class VagueSelectView {
    public VagueSelectView() throws Exception {
        Scanner scanner = new Scanner(System.in);
        createVagueSelectView();
        VagueSelectUseCase vagueSelectUseCase =  new VagueSelectUseCase(scanner.next());
        createVagueSelectResultView(vagueSelectUseCase.searchWithVague());

        ViewUtil.terminate();
    }
    private void createVagueSelectView() {
        /* コンソールでViewを記載 */
        System.out.println();
        System.out.println("------------------");
        System.out.println("あいまい検索");
        System.out.println("------------------");
        System.out.println();
        System.out.println("任意文字を入力して検索を行ってください");
        System.out.print(">");

    }

    private void createVagueSelectResultView(List<Book> bookList) {
        /* 検査結果にてViewを記載 */
        System.out.println();
        System.out.println("------------------");
        System.out.println("あいまい検索結果");
        System.out.println("------------------");
        if(bookList.isEmpty()){
            System.out.println();
            System.out.println("検索結果はありませんでした。");
        }else {
            for (Book book : bookList) {
                System.out.println();
                System.out.println("書籍名：" + book.getTitle());
                System.out.println("著者名：" + book.getAuthor());
                System.out.println("出版日：" + book.getPublishDate());
            }
        }
    }
}
