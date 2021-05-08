package entity.concretes;

import dataAccess.concretes.MySqlUserDao;
import entity.abstracts.Entity;

public class Customer implements Entity{

    private int id;
    private String firtsname;
    private String lastName;
    private String email;
    private String password;
    
    public Customer(int id, String firtsname, String lastName, String email, String password) {
        this.id = id;
        this.firtsname = firtsname;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Customer(){
        super();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirtsname() {
        return firtsname;
    }
    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}