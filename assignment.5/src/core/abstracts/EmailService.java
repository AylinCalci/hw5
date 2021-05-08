package core.abstracts;

import entity.concretes.Customer;

public interface EmailService {
    boolean checkCustomer(Customer customer);
}