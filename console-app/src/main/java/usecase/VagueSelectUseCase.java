package usecase;

import domein.Book;
import gateway.VagueSelectGateway;
import port.VagueSelectPort;

import java.util.List;

public class VagueSelectUseCase {
    final String scanner;

    public VagueSelectUseCase(String scanner) {
        this.scanner = scanner;
    }

    public List<Book> searchWithVague() throws Exception {
        VagueSelectPort vagueSelectPort = new VagueSelectGateway();
        return  vagueSelectPort.search(scanner);
    }


}
