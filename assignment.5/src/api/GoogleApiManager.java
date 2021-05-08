package api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleApiManager implements ApiService {

    @Override
    public boolean checkMail(String email){
        String mailPattern="^[A-Z0-9._%+-]+@(gmail)+.(com)?$";
        Pattern ptr=Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);

        Matcher matcher=ptr.matcher(email);
        if(matcher.matches()==true) {
            System.out.println("Baþarýlý giriþ google");
            return true;
        }
        System.out.println("Geçersiz e-mail");
        return false;
    }

    @Override
    public boolean log(String message) {
        return false;
    }
}