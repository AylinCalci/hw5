package business.concretes;

import api.ApiService;
import business.abstracts.UserManagerService;
import core.abstracts.EmailService;
import core.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entity.concretes.Customer;

import java.util.Scanner;

public class UserManager implements UserManagerService {

    private EmailService[] emailServices;
    private UserDao userDao;
    private UserService userService;
    private ApiService apiService;

    public UserManager(EmailService[] emailServices, UserDao userDao, UserService userService, ApiService apiService) {
        super();
        this.emailServices = emailServices;
        this.userDao = userDao;
        this.userService = userService;
        this.apiService = apiService;
    }

    @Override
    public void register(Customer customer){
        for (EmailService emailService : emailServices){
            if(emailService.checkCustomer(customer)==false){
                System.out.println("Kay�t i�lemi ba�ar�s�z bilgilerinizi kontrol ediniz.");
                return;
            }
        }

        if (userService.userCode()==false){
            System.out.println("Do�rulama i�lemi ba�ar�s�z.");
            return;
        }
        else{
            System.out.println("Do�rulama i�lemi ba�ar�l�.");
            System.out.println("Kay�t i�lemi ba�ar�l�.");
            System.out.println(customer);
        }
    }

    @Override
    public void login(Customer customer){
        Scanner scr = new Scanner(System.in);
        System.out.println("Mail adresinizi giriniz: ");
        String email = scr.nextLine();
        System.out.println("L�tfen �ifrenizi giriniz: ");
        String password = scr.nextLine();

        if (email.equals(customer.getEmail()) && password.equals(customer.getPassword())){
            userDao.login(customer.getEmail(),customer.getPassword());
            System.out.println("Giri� i�lemi ba�ar�l�");
            return;
        }else {
            System.out.println("Giri� i�lemi ba�ar�s�z..!");
        }
    }

    @Override
    public void googleRegister(Customer customer) {

        for (EmailService emailService: emailServices) {
            if(emailService.checkCustomer(customer)==false) {
                System.out.println("Google ile giri� ba�ar�s�z ");
                System.out.println("*******");
                return;
            }

        }

        if(apiService.checkMail(customer.getEmail())==true) {
            apiService.log("Google ile kay�t yap�ld�: " +customer.getEmail());
            System.out.println("*******");
            userDao.add(customer);
        }

    }

    @Override
    public void googleLogin(Customer customer) {


    }

}