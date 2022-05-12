package usecase;

import domein.Book;
import gateway.BookSelectGateway;
import port.BookSelectPort;

import java.util.List;

public class BookSelectUseCase {
    private String scanner;

    public BookSelectUseCase(String scanner) {
        this.scanner = scanner;
    }

    public List<Book> selectBook() throws Exception {
        BookSelectPort bookSelectPort = new BookSelectGateway();
        return bookSelectPort.select(this.scanner);

    }
}
