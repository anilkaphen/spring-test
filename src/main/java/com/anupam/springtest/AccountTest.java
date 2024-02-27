package com.anupam.springtest;

import com.anupam.springtest.modal.SavingAccount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountTest {
    private static List<SavingAccount> accountDetails = new ArrayList<>();

    public static void main(String[] args) {
        AccountTest accountTest = new AccountTest();

        accountDetails = accountTest.saveAccounts();

        long maxBalance = accountTest.getMaxAccountBalance(accountDetails);
        System.out.println("getMaxAccountBalance: \n" + maxBalance);

        long MinBalance = accountTest.getMinBalance(accountDetails);
        System.out.println("getMinBalance: \n" + MinBalance);

        List<SavingAccount> AccountByCity = accountTest.getAccountByCity("Patna");
        System.out.println("getAccountByCity: \n" + AccountByCity);

        long AccountAverageBalance = accountTest.getAccountAverageBalance();
        System.out.println(" getAccountAverageBalance\n: " + AccountAverageBalance);

        System.out.println(" getAccountByGender\n: " + accountTest.getAccountByGender(false));
    }

    public List<SavingAccount> saveAccounts() {
        List<SavingAccount> list = new ArrayList<>();

        list.add(new SavingAccount("AC001", "Mohan", 10, "Patna", 10000, "Bihar", true, LocalDate.of(1992, 02, 15)));
        list.add(new SavingAccount("AC002", "Sohan", 12, "Muz", 20000, "Bihar", true, LocalDate.of(1994, 03, 14)));
        list.add(new SavingAccount("AC003", "Ram", 14, "Muz", 5000, "Bihar", true, LocalDate.of(1996, 05, 12)));
        list.add(new SavingAccount("AC004", "Sita", 16, "Mumbai", 7000, "Maha", false, LocalDate.of(1998, 07, 10)));
        list.add(new SavingAccount("AC005", "Raja", 18, "Pune", 11000, "Bihar", true, LocalDate.of(1999, 10, 6)));
        list.add(new SavingAccount("AC006", "Gita", 21, "Delhi", 18000, "Delhi", false, LocalDate.of(2000, 04, 5)));

        return list;
    }

    public long getMaxAccountBalance(List<SavingAccount> savingAccounts) {
        long max = -1;
        for (SavingAccount s : savingAccounts) {
            if (max < s.getBalance()) {
                max = s.getBalance();
            }
        }
        return max;
    }

    public List<SavingAccount> getAccountByCity(String city) {
        List<SavingAccount> list = new ArrayList<>();
        for (SavingAccount s : accountDetails) {
            if (s.getCity().equals(city)) {
                list.add(s);
            }
        }
        return list;
    }

    public long getAccountAverageBalance() {
        long sum = 0;
        for (int i = 0; i < accountDetails.size(); i++) {
            sum += accountDetails.get(i).getBalance();
        }
        return sum / accountDetails.size();
    }

    public long getMinBalance(List<SavingAccount> savingAccounts) {
        long lowest = 99999;
        for (SavingAccount c : savingAccounts) {
            if (lowest > c.getBalance()) {
                lowest = c.getBalance();
            }
        }
        return lowest;
    }

    public List<SavingAccount> getAccountByGender(boolean gender) {
        List<SavingAccount> list = new ArrayList<>();
        for (SavingAccount s : accountDetails) {
            if (s.isGender()==(gender)) {
                list.add(s);
            }
        }
        return list;
    }
}



