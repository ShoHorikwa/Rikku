package usecase;

import domein.Book;
import domein.User;
import gateway.UserSelectGateway;
import port.UserSelectPort;
import java.util.List;

public class UserSelectUseCase {
    private final String scanner;
    public UserSelectUseCase(String scanner) {
        this.scanner = scanner;
    }
    public List<Book> selectUser() throws Exception {

        UserSelectPort userSelectPort = new UserSelectGateway();
        return userSelectPort.search(this.scanner);
    }
}
