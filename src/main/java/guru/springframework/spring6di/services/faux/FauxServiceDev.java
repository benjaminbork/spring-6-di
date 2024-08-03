package guru.springframework.spring6di.services.faux;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev","default"})
@Service("fauxService")
@Primary
public class FauxServiceDev implements FauxService {
    @Override
    public String getDataSource() {
        return "dev";
    }
}
