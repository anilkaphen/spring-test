package com.anupam.springtest.modal;

import com.anupam.springtest.Account1;

import java.util.ArrayList;
import java.util.List;

public class AccountList {

    public static void main(String[] args) {

        AccountList list = new AccountList();
    }


    public List <Account1> getArryList(){
        ArrayList<Account1> list = new ArrayList<>();

        list.add(new Account1(5000,"Mohan",10,"Patna",10000,"Bihar","Female","01/01/2024"));

        return null;
    }


}
