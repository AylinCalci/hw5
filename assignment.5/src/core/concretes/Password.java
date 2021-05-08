package core.concretes;

import core.abstracts.EmailService;
import entity.concretes.Customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password implements EmailService {

    String passwordPtr = "^(?=.{6,32}$)(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%*?^:;+-._,])(?=.*[0-9]).*";
    /*
    (?=.{6,32}$) >>>>> 6 ile 32 karakter aras� olabilir
    (?=.*[A-Z]) >>>>> A ve Z aras� bir b�y�k harf zorunlu
    (?=.*[a-z]) >>>>> a ve z aras� bir k���k harf zorunlu
    (?=.*[0-9]) >>>>> 0 ile 9 aras� bir rakam zorunlu
    (?=.*[@#$%*?^:;+-._,]) >>>>> bizim belirledi�imiz �zel karakterler bir tane zorunlu
    http://www.atakancoban.com/index.php/2017/10/18/primefaces-regex-kullanimi-kuralli-sifre-olusturma -ben burdan ald�m-/
     */
    Pattern ptr=Pattern.compile(passwordPtr);

    @Override
    public boolean checkCustomer(Customer customer) {
        Matcher matcher = ptr.matcher(customer.getPassword());
        if (matcher.matches()==true){
            System.out.println("�ifrenizde en az bir tane rakam\n" +
                    "bir tane b�y�k harf\n" +
                    "bir tane k���k harf\n" +
                    "bir tane �zel karakter bulunmal�d�r.");
            return true;
        }
        return false;
    }
}