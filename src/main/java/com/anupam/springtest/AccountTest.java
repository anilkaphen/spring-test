package com.anupam.springtest;

import com.anupam.springtest.modal.SavingAccount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountTest {

    public static void main(String[] args) {

        AccountTest list = new AccountTest();
    }


    public List <SavingAccount> getArryList(){
        List<SavingAccount> list = new ArrayList<>();

        list.add(new SavingAccount("AC001","Mohan",10,"Patna",10000,"Bihar",false, LocalDate.of(1992, 02, 15)));
        list.add(new SavingAccount("AC001","Mohan",10,"Patna",10000,"Bihar",false, LocalDate.of(1992, 02, 15)));

        return null;
    }


}
