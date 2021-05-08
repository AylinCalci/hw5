package api;

import entity.concretes.Customer;

public interface ApiService {

    boolean checkMail(String email);
    boolean log(String message);
}