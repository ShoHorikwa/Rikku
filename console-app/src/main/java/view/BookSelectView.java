package view;

import domein.Book;
import usecase.BookSelectUseCase;

import java.util.List;
import java.util.Scanner;

public class BookSelectView {
    public BookSelectView() throws Exception {
        Scanner scanner = new Scanner(System.in);
        createBookSelectView();
        BookSelectUseCase bookSelectUseCase = new BookSelectUseCase(scanner.next());
        createBookSelectResultView(bookSelectUseCase.selectBook());

        ViewUtil.terminate();
    }

    private void  createBookSelectView() {
        System.out.println();
        System.out.println("------------------");
        System.out.println("書籍名検索");
        System.out.println("------------------");
        System.out.println();
        System.out.println("タイトル名を任意に入力して操作を行ってください");
        System.out.print(">");
    }

    private void createBookSelectResultView(List<Book> bookList) {

        System.out.println();
        System.out.println("------------------");
        System.out.println("書籍名検索結果");
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
