import api.ApiService;
import api.GoogleApiManager;
import business.abstracts.UserManagerService;
import business.concretes.UserManager;
import core.abstracts.EmailService;
import core.abstracts.UserService;
import core.concretes.*;
import dataAccess.concretes.MySqlUserDao;
import entity.concretes.Customer;

public class Main {

    public static void main(String[] args) {

        EmailService[] emailServices = {new Mail(),new Password(),new Name(),new RepeatMail()};

        UserService userServiceAdaptor = new UserCode();
        ApiService apiService=new GoogleApiManager();

        Customer customer1 = new Customer(1,"Aylin","Calçý","aylincalci@gmail.com","Vo25871964.");
        Customer customer2 = new Customer(2,"Batuhan","Altan","batuhanaltan@gmail.com","Bt98541233.");
        UserManagerService userManagerService = new UserManager(emailServices, new MySqlUserDao(),userServiceAdaptor,apiService);

        userManagerService.login(customer1);
        userServiceAdaptor.userCode();
        emailServices.clone();

        RepeatMail repeatMail = new RepeatMail();
        repeatMail.checkCustomer(customer2);
        apiService.log("google");
        apiService.checkMail("aylincalci@gmail.com");

        userManagerService.register(customer2);

    }
}