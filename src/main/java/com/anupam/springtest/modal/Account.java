package com.anupam.springtest.modal;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Account {

    private String id;
    private String name;
    private  boolean gender;
    private String dob;
    private  int accountnumber;

    private int balance;
    private  String city;

//    public Account(){}
//    public Account(String id, String name, boolean gender, String dob, int accountnumber, int balance, String city) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.dob = dob;
//        this.accountnumber = accountnumber;
//        this.balance = balance;
//        this.city = city;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public boolean isGender() {
//        return gender;
//    }
//
//    public void setGender(boolean gender) {
//        this.gender = gender;
//    }
//
//    public String getDob() {
//        return dob;
//    }
//
//    public void setDob(String dob) {
//        this.dob = dob;
//    }
//
//    public int getAccountnumber() {
//        return accountnumber;
//    }
//
//    public void setAccountnumber(int accountnumber) {
//        this.accountnumber = accountnumber;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "Account{" +
//                "id="+id+
//                " name='" + name + '\'' +
//                ", gender=" + gender +
//                ", dob='" + dob + '\'' +
//                ", accountnumber=" + accountnumber +
//                ", balance=" + balance +
//                ", city='" + city + '\'' +
//                '}';
//    }
}
