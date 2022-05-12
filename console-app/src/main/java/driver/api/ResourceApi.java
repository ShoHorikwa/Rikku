package driver.api;

import domein.Book;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ResourceApi {

    private  final String resourcePath = "src/main/resources/book_data.csv";

    public List<Book> fetcher() throws Exception {
        /* リソースファイルから取得 */
        URI uri = new URI(resourcePath);
        Path resource = Path.of(resourcePath);

        if(!resource.toFile().exists()) {
            System.out.println("取得元のデータが取得できません");
        }


        List<Book> featchResult = new ArrayList<>();
        for(String fileline : Files.readAllLines(resource)) {
            featchResult.add(convertBook(fileline));
        }
        return featchResult;
    }


    private Book convertBook(String fileLine) throws Exception {
        String[] element = fileLine.split(",");

        if(element.length  != 3 ) {
            throw new Exception("csvの要素数が異なります");
        }

        return new Book(element[0],element[1],element[2]);

    }
}
