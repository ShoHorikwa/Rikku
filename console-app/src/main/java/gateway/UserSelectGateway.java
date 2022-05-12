package gateway;

import domein.Book;
import domein.User;
import driver.UserSelectDriver;
import port.UserSelectPort;

import java.util.List;

public class UserSelectGateway implements UserSelectPort {
    @Override
    public List<Book> search(String scanner) throws Exception {
        return new UserSelectDriver().search(scanner);
    }
}
