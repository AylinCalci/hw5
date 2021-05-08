package business.abstracts;

import entity.concretes.Customer;

public interface UserManagerService {
    void register(Customer customer);

    void login(Customer customer);

    void googleRegister(Customer customer);


    void googleLogin(Customer customer);
}