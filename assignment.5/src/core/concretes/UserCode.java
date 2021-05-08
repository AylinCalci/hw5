package core.concretes;

import core.abstracts.UserService;

import java.util.Scanner;

public class UserCode implements UserService {

    @Override
    public boolean userCode(){
        int realCode = (int) (Math.random()*1000);
        System.out.println("Do�rulama kodunuz : " + realCode);

        Scanner sc = new Scanner(System.in);
        System.out.println("Do�rulama kodunu giriniz: ");
        int inputCode = sc.nextInt();

        if (realCode == inputCode){
            System.out.println("Do�rulama i�lemi ger�ekle�mi�tir.");
            return true;
        }
        return false;
    }
}