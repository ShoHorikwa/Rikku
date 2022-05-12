package port;

import domein.Book;

import java.util.List;

public interface BookSelectPort {
    List<Book> select(String scanner) throws Exception;
}
