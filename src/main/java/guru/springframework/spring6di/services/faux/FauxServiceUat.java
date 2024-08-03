package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("fauxService")
public class FauxServiceUat implements FauxService {
    @Override
    public String getDataSource() {
        return "uat";
    }
}
