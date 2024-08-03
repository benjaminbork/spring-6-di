package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DE")
@Service("i18nService")
public class GermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo Welt - DE";
    }
}
