package core.concretes;

import core.abstracts.EmailService;
import entity.concretes.Customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password implements EmailService {

    String passwordPtr = "^(?=.{6,32}$)(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%*?^:;+-._,])(?=.*[0-9]).*";
    /*
    (?=.{6,32}$) >>>>> 6 ile 32 karakter arasý olabilir
    (?=.*[A-Z]) >>>>> A ve Z arasý bir büyük harf zorunlu
    (?=.*[a-z]) >>>>> a ve z arasý bir küçük harf zorunlu
    (?=.*[0-9]) >>>>> 0 ile 9 arasý bir rakam zorunlu
    (?=.*[@#$%*?^:;+-._,]) >>>>> bizim belirlediðimiz özel karakterler bir tane zorunlu
    http://www.atakancoban.com/index.php/2017/10/18/primefaces-regex-kullanimi-kuralli-sifre-olusturma -ben burdan aldým-/
     */
    Pattern ptr=Pattern.compile(passwordPtr);

    @Override
    public boolean checkCustomer(Customer customer) {
        Matcher matcher = ptr.matcher(customer.getPassword());
        if (matcher.matches()==true){
            System.out.println("Þifrenizde en az bir tane rakam\n" +
                    "bir tane büyük harf\n" +
                    "bir tane küçük harf\n" +
                    "bir tane özel karakter bulunmalýdýr.");
            return true;
        }
        return false;
    }
}