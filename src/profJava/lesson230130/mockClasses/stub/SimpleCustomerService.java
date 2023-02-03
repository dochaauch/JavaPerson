package profJava.lesson230130.mockClasses.stub;

public class SimpleCustomerService implements CustomerService {

    CustomerRepository customerRepository;

    public SimpleCustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getCustomerById(long id) {
        return customerRepository.getCustomerById(id);

    }
}