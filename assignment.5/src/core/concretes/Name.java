package core.concretes;

import core.abstracts.EmailService;
import entity.concretes.Customer;

public class Name implements EmailService {

    @Override
    public boolean checkCustomer(Customer customer) {
        if (customer.getFirtsname().length()<= 2 && customer.getLastName().length() <= 2){
            System.out.println("Geçerli ad soy ad giriþi");
            return true;
        }
        System.out.println("Geçersiz isim ve soyisim");
        return false;
    }
}