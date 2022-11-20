package jamal.autogaragev3.garagev3.Customer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/Customer")
public class CustomerController {

    private CustomerRepository customerRepository;

    CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @PostMapping("/newCustomer")
    Customer newCustomer(@RequestBody Customer newCustomer) {
        return customerRepository.save(newCustomer);
    }
    @GetMapping(path="/Customer/{id}")
    Customer GetOneCustomer(@PathVariable Long id) {

        return customerRepository.findById(id)
                .orElseThrow(() ->new CustomerNotFoundException(id));
    }
    @GetMapping(path="/allCustomers")
    public @ResponseBody Iterable<Customer> GetAllCustomers() {
        return customerRepository.findAll();
    }


    @PutMapping("Customer/{id}")
    Customer ReplaceCustomer(@RequestBody Customer newCustomer, @PathVariable Long id) {

        return customerRepository.findById(id)

                .map(customer -> {
                    customer.setCustomerName(newCustomer.getCustomerName());
                    customer.setCustomerLastName(customer.getCustomerLastName());
                    customer.setPhoneNumber(customer.getPhoneNumber());
                    customer.setCustomerEmail(customer.getCustomerEmail());
                    customer.setCustomerAddress(customer.getCustomerEmail());
                    return customerRepository.save(customer);
                })
                .orElseGet(() -> {
                    newCustomer.setId(id);
                    return customerRepository.save(newCustomer);
                });

    }
    @DeleteMapping("/Customer/{id}")
    void deleteCustomer(@PathVariable Long id) {
        customerRepository.deleteById(id);
    }
}
