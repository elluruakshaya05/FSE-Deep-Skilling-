public class CustomerService {
    private CustomerRepository repository;

    // Constructor injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void showCustomer(String id) {
        Customer customer = repository.findCustomerById(id);
        if (customer != null) {
            System.out.println("Customer Found:");
            System.out.println("ID   : " + customer.getId());
            System.out.println("Name : " + customer.getName());
        } else {
            System.out.println("Customer not found for ID: " + id);
        }
    }
}

