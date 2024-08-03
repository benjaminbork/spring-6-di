package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("fauxService")
public class FauxServiceQa implements FauxService {
    @Override
    public String getDataSource() {
        return "qa";
    }
}
