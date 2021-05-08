package core.concretes;

import core.abstracts.UserService;

import java.util.Scanner;

public class UserCode implements UserService {

    @Override
    public boolean userCode(){
        int realCode = (int) (Math.random()*1000);
        System.out.println("Doðrulama kodunuz : " + realCode);

        Scanner sc = new Scanner(System.in);
        System.out.println("Doðrulama kodunu giriniz: ");
        int inputCode = sc.nextInt();

        if (realCode == inputCode){
            System.out.println("Doðrulama iþlemi gerçekleþmiþtir.");
            return true;
        }
        return false;
    }
}