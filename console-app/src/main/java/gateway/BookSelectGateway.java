package gateway;

import domein.Book;
import driver.BookSelectDriver;
import port.BookSelectPort;

import java.util.List;

public class BookSelectGateway implements BookSelectPort {
    @Override
    public List<Book> select(String scanner) throws Exception {
        return new BookSelectDriver().selectBook(scanner);
    }
}
