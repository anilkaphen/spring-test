package com.anupam.springtest;

import com.anupam.springtest.modal.SavingAccount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountMapTest {


    private static Map<String, SavingAccount> accountMap = new HashMap<>();

    public static void main(String[] args) {
        AccountMapTest accountMapTest = new AccountMapTest();
        Map<String, SavingAccount> saveAccounts = accountMapTest.saveAccounts();
        System.out.println("saveAccounts: \n" + saveAccounts);
        List<SavingAccount> AccountByCity = accountMapTest.getAccountByCity(saveAccounts, "Patna");
        System.out.println("The AccountByCity: " + AccountByCity);

        long savingAccountMap = accountMapTest.getMaxAccountBalance(accountMap);
        System.out.println("getMaxAccountBalance: \n" + savingAccountMap);
        long savingAccountMap1=accountMapTest.getminAccountBalance(accountMap);
        System.out.println("getMinAccountBalance: \n" + savingAccountMap1);

       // Map AccountByCity = accountMapTest.getAccountByCity(saveAccounts,"Patna");

       // System.out.println("getAccountByCity: \n" + AccountByCity);


    }

    public Map<String, SavingAccount> saveAccounts() {
        accountMap.put("AC001", new SavingAccount("AC001", "Mohan", 10, "Patna", 10000, "Bihar", true, LocalDate.of(1992, 02, 15)));
        accountMap.put("AC002", new SavingAccount("AC002", "Sohan", 12, "Muz", 20000, "Bihar", true, LocalDate.of(1994, 03, 14)));
        accountMap.put("AC003", new SavingAccount("AC003", "Ram", 14, "Muz", 5000, "Bihar", true, LocalDate.of(1996, 05, 12)));
        accountMap.put("AC004", new SavingAccount("AC004", "Sita", 16, "Mumbai", 7000, "Maha", false, LocalDate.of(1998, 07, 10)));
        accountMap.put("AC005", new SavingAccount("AC005", "Raja", 18, "Pune", 11000, "Bihar", true, LocalDate.of(1999, 10, 6)));
        accountMap.put("AC006", new SavingAccount("AC006", "Gita", 21, "Delhi", 18000, "Delhi", false, LocalDate.of(2000, 04, 5)));
        return accountMap;
    }

    public long getMaxAccountBalance(Map<String, SavingAccount> map) {
        long max = -1;
        for (SavingAccount s : map.values()) {
            if (max < s.getBalance()) {
                max = s.getBalance();
            }

        }
        return max;
    }

    public long getminAccountBalance(Map<String, SavingAccount> map) {
        long min = 99999;
        for (SavingAccount s : map.values()) {
            if (min > s.getBalance()) {
                min = s.getBalance();
            }
        }
        return  min;
    }

    public List<SavingAccount> getAccountByCity(Map<String, SavingAccount> map, String city) {
        List<SavingAccount> list = new ArrayList<>();
        for (SavingAccount e : map.values()) {
            if (e.getCity().equals(city)) {
                list.add(e);
            }
        }
        return list;
    }
//    public long getAccountAverageBalance(Map<String, SavingAccount> map) {
//        long sum = 0;
//        for(SavingAccount s : map.values()){
//            sum += SavingAccount.get(s).getvalue();
//        }
//        return sum / SavingAccount.size();
//    }
}






