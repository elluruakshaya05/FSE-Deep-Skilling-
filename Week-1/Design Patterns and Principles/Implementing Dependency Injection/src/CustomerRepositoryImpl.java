import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerDB = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Pre-load some dummy data
        customerDB.put("C001", new Customer("C001", "Alice"));
        customerDB.put("C002", new Customer("C002", "Bob"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerDB.get(id);
    }
}

