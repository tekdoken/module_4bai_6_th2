package th2.service;

import th2.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
