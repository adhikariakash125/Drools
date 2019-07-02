package Drools.DroolsServices;

import Drools.Configuration.DroolConfiguration;
import Drools.DTO.Customer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DroolService {
    private KieSession kieSession = new DroolConfiguration().getKieSession();

    public Customer insertCustomer(Customer customer) {
        kieSession.insert(customer);
        kieSession.fireAllRules();
        return customer;
    }
}
