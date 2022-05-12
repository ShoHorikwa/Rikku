package driver;

import domein.Book;
import driver.api.ResourceApi;

import java.util.List;
import java.util.stream.Collectors;

public class BookSelectDriver {
    public List<Book> selectBook(String scanner) throws Exception {
        List fetchResult = new ResourceApi().fetcher();

        return searchBookList(scanner, fetchResult);
    }

    private List<Book> searchBookList(String scanner, List<Book> fetchResult) {
        List<Book> searchResult = fetchResult
                .stream()
                .filter(c -> c.getTitle().contains(scanner))
                .collect(Collectors.toList());
        if(searchResult.isEmpty()) {
            System.out.println("Search for No Results in Title");
        }
        return  searchResult;
    }
}