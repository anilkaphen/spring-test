package com.anupam.springtest;

import java.time.LocalDate;

public class Account1 {
    private int AccNo;
    private String name;
    private int age;
    private String city;
    private long balance;
    private String state;
    private boolean gender;
    private LocalDate dob;

    public Account1(int accNo, String name, int age, String city, long balance, String state, boolean gender, LocalDate dob) {
        AccNo = accNo;
        this.name = name;
        this.age = age;
        this.city = city;
        this.balance = balance;
        this.state = state;
        this.gender = gender;
        this.dob = dob;
    }

    public Account1() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccNo=" + AccNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", balance=" + balance +
                ", state='" + state + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                '}';
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int accNo) {
        AccNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}


