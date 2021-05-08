package dataAccess.abstracts;

import entity.concretes.Customer;

public interface UserDao {

    void add(Customer customer);

    void login(String mail, String password);

}