package gateway;

import domein.Book;
import driver.VagueSelectDriver;
import port.VagueSelectPort;

import java.util.ArrayList;
import java.util.List;

public class VagueSelectGateway implements VagueSelectPort {

    @Override
    public List<Book> search(String scanner) throws Exception {
        return new VagueSelectDriver().search(scanner);
    }
}
