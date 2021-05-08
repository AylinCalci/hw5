package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entity.concretes.Customer;

public class MySqlUserDao implements UserDao{

    public ArrayList<Customer> customers = new ArrayList<Customer>();

    @Override
    public void add(Customer customer){
        customers.add(customer);
        System.out.println("My sql db ile kay�t i�lemi ger�ekle�mi�tir.");
    }

    @Override
    public void login(String mail, String password){
        System.out.println("Ba�ar�l� giri�");
    }
        
    
    
}