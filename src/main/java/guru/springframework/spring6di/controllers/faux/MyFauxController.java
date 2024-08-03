package guru.springframework.spring6di.controllers.faux;

import guru.springframework.spring6di.services.faux.FauxService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyFauxController {
    private final FauxService fauxService;

    public MyFauxController(@Qualifier("fauxService") FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String getDataSource() {
        return fauxService.getDataSource();
    }
}
