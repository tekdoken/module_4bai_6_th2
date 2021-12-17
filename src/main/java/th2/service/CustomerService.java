package th2.service;


import th2.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import th2.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerRepository.insertWithStoredProcedure(customer);
    }
}
