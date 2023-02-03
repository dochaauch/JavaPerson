package profJava.lesson230130.testClasses.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import profJava.lesson230130.mockClasses.stub.*;

import static org.mockito.ArgumentMatchers.anyLong;

public class CustomerRepositoryTest {

    @Test
    void testInvalidCustomer() {
        Customer customer = new Customer();
        CustomerRepository customerRepository =
                Mockito.mock(CustomerRepository.class);
        Mockito.when(customerRepository.getCustomerById(anyLong()))
                .thenThrow(new CustomerNotFoundException());

        CustomerService customerService =
                new SimpleCustomerService(customerRepository);
        Assertions.assertThrows(CustomerNotFoundException.class,
                () -> customerService.getCustomerById(customer.getId()));
    }
}