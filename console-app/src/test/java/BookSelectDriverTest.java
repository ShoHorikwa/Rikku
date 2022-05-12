import domein.Book;
import driver.BookSelectDriver;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.List;
import  org.junit.Assert;

class BookSelectDriverTest {
    private BookSelectDriver target;

    @Test
    private List<Book> システムから入力された文字列よりタイトルを検索して検索結果を返却する() {
        List<Book> testData = null;
        testData.add(new Book("t1","a1","2021-01-01"));
        testData.add(new Book("t2","a2","2021-01-02"));
        testData.add(new Book("t3","a3","2021-01-03"));


        List<Book> expected = null;
        expected.add(new Book("t1","a1","2021-01-01"));
        try {
            String targetMmethodName = "searchBookList";
            Method method = BookSelectDriver.class.getDeclaredMethod(targetMmethodName);
            method.setAccessible(true);
            Object actual  = (Object) method.invoke(this.target);
            Assert.assertEquals(expected, actual);


        } catch (Exception ex) {
            ex.printStackTrace();

        }

        return  null;
    }

}
