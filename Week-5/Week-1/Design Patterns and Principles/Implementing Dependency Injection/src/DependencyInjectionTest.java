public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Step 1: Create repository implementation
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Step 2: Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Step 3: Use service to find and display customer
        service.showCustomer("C001");
        service.showCustomer("C999"); // Invalid ID for test
    }
}

