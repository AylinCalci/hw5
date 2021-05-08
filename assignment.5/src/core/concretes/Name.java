package core.concretes;

import core.abstracts.EmailService;
import entity.concretes.Customer;

public class Name implements EmailService {

    @Override
    public boolean checkCustomer(Customer customer) {
        if (customer.getFirtsname().length()<= 2 && customer.getLastName().length() <= 2){
            System.out.println("Ge�erli ad soy ad giri�i");
            return true;
        }
        System.out.println("Ge�ersiz isim ve soyisim");
        return false;
    }
}