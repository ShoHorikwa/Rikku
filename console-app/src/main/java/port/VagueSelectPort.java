package port;

import domein.Book;

import java.util.List;

public interface VagueSelectPort {
    List<Book>  search(String scanner) throws Exception;
}
