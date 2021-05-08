package core.concretes;

import core.abstracts.EmailService;
import entity.concretes.Customer;

import java.util.ArrayList;

public class RepeatMail implements EmailService {

    private ArrayList<String> emails = new ArrayList<String>();

    public RepeatMail(){

    }

    @Override
    public boolean checkCustomer(Customer customer) {
        if (emails.isEmpty()){
            System.out.println("Bu mail adresi ile daha �nce kay�t yap�lmam��t�r.");
            emails.add((customer.getEmail()));
            return true;
        }
        for (String email : emails){
            if (email == customer.getEmail()){
                System.out.println("Bu mail adresi ile daha �nce kay�t i�lemi ger�ekle�mi�tir.");
                return false;
            }
        }
        System.out.println("Bu mail adresi daha �nce kay�t edilmedi.");
            emails.add(customer.getEmail());
            return true;
    }
}