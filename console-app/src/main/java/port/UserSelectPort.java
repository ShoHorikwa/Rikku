package port;

import domein.Book;
import domein.User;

import java.util.List;

public interface UserSelectPort {
    List<Book> search(String scanner) throws Exception;
}