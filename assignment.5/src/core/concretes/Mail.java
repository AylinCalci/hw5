package core.concretes;

import core.abstracts.EmailService;
import entity.concretes.Customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail implements EmailService {

    String emailPtr = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    Pattern ptr = Pattern.compile(emailPtr, Pattern.CASE_INSENSITIVE);

    @Override
    public boolean checkCustomer(Customer customer){
        Matcher matcher = ptr.matcher(customer.getEmail());
        if (matcher.matches()==true){
            System.out.println("Ge�erli mail adresi giri�i");
            return true;
        }
        System.out.println("Ge�ersiz email giri�i");
        return false;
    }
}