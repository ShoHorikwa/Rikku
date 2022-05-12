package driver;

import domein.Book;
import driver.api.ResourceApi;

import java.util.List;
import java.util.stream.Collectors;

public class VagueSelectDriver {
    public List<Book> search(String sccan) throws Exception {
        List<Book> featchResuilt = new ResourceApi().fetcher();

        return search(sccan, featchResuilt);

    }

    private List<Book> search(String scanner, List<Book> featchResult) {

        List<Book> searchResult  =
                featchResult.stream()
                        .filter(c -> judgeElement(c, scanner))
                        .collect(Collectors.toList());
        return  searchResult;
    }

    private boolean judgeElement(Book book,String sccanner){
        boolean result = false;
        if (book.getAuthor().contains(sccanner)
                || book.getTitle().contains(sccanner)
                || book.getPublishDate().contains(sccanner))
        {
            result = true;
        }
        return  result;
    }
}
