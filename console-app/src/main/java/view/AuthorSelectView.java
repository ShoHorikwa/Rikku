package view;

import domein.Book;
import domein.User;
import usecase.UserSelectUseCase;

import java.util.List;
import java.util.Scanner;

public class AuthorSelectView {
    public AuthorSelectView() throws Exception {
        Scanner scanner = new Scanner(System.in);
        createUserSelectView();
        UserSelectUseCase useCase = new UserSelectUseCase(scanner.next());
        createUserSelectResultView(useCase.selectUser());

        /* 停止阻止用 */
        ViewUtil.terminate();
    }

    private void createUserSelectView() {
        System.out.println();
        System.out.println("------------------");
        System.out.println("著者名検索");
        System.out.println("------------------");
        System.out.println();
        System.out.println("著者名を任意に入力して検索を行ってください");
        System.out.print(">");

    }

    private void createUserSelectResultView(List<Book> userList) {
        System.out.println();
        System.out.println("------------------");
        System.out.println("著者名検索結果");
        System.out.println("------------------");
        if(userList.isEmpty()){
            System.out.println();
            System.out.println("検索結果はありませんでした。");
        }else{
            for (Book book : userList) {
                System.out.println();
                System.out.println("書籍名：" + book.getTitle());
                System.out.println("著者名：" + book.getAuthor());
                System.out.println("出版日：" + book.getPublishDate());
            }
        }
    }

}
