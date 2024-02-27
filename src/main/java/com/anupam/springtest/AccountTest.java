package com.anupam.springtest;

import com.anupam.springtest.modal.Car;
import com.anupam.springtest.modal.SavingAccount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.anupam.springtest.modal.SavingAccount.*;

public class AccountTest {

    private static List<SavingAccount> employeeDetails = new ArrayList<>();

    public static void main(String[] args) {

        AccountTest list = new AccountTest();
        long maxBalance = list.getMaxBalEmployedetails(employeeDetails);
        System.out.println("getMaxBalEmployedetails: \n" + maxBalance);
        int MinBalance = list.getMinBalance(employeeDetails);
        System.out.println("getMinBalance: \n" + MinBalance);

        List<SavingAccount> AccountByCity = list.getAccountByCity("Patna");
        System.out.println("getAccountByCity: \n" + AccountByCity);


        Long AccountAverageBalance = list.getAccountAverageBalance();
        System.out.println(" getAccountAverageBalance\n: \n" + AccountAverageBalance);

    }


    public List<SavingAccount> getArryList() {
        List<SavingAccount> list = new ArrayList<>();

        list.add(new SavingAccount("AC001", "Mohan", 10, "Patna", 10000, "Bihar",false, LocalDate.of(1992, 02, 15)));
        list.add(new SavingAccount("AC002", "Sohan", 12, "Patna", 20000, "Bihar", false, LocalDate.of(1994, 03, 14)));
        list.add(new SavingAccount("AC003", "Ram", 14, "Patna", 5000, "Bihar", false, LocalDate.of(1996, 05, 12)));
        list.add(new SavingAccount("AC004", "Sita", 16, "Patna", 7000, "Bihar", false, LocalDate.of(1998, 07, 10)));
        list.add(new SavingAccount("AC005", "Raja", 18, "Patna", 11000, "Bihar", false, LocalDate.of(1999, 10, 6)));
        list.add(new SavingAccount("AC006", "Gita", 21, "Patna", 18000, "Bihar", false, LocalDate.of(2000, 04, 5)));

        return null;
    }

    public long getMaxBalEmployedetails(List<SavingAccount> savingAccounts) {

        int max = -1;
        for (SavingAccount s : savingAccounts) {
            if (max < s.getBalance()) {
                max = s.getBalance();
            }
        }
        return max;
    }

    public List<SavingAccount> getAccountByCity(String city) {
        List<SavingAccount> list = new ArrayList<>();
        for (SavingAccount s : employeeDetails) {
            if (s.getCity().equals(city)) {
                list.add(s);
            }
        }
        return list;
    }

    public long getAccountAverageBalance() {
        int sum = 0, avg = 0;
        for (int i = 0; i < employeeDetails.size(); i++) {
            sum += employeeDetails.get(i).getBalance();
        }
        avg = sum / employeeDetails.size();
        return avg;
    }




    public int getMinBalance(List<SavingAccount> savingAccounts) {
        int lowest = 99999;
        for (SavingAccount c : savingAccounts) {
            if (lowest > c.getBalance()) {
                lowest = c.getBalance();
            }
        }
        return lowest;
    }


    }



