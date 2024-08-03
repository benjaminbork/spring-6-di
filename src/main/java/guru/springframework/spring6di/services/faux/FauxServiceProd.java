package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("fauxService")
public class FauxServiceProd implements FauxService {
    @Override
    public String getDataSource() {
        return "prod";
    }
}
