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

    }
    public List<SavingAccount> saveAccounts() {
        List<SavingAccount> list = new ArrayList<>();

        accountMap.put("AC001", new SavingAccount("AC001", "Mohan", 10, "Patna", 10000, "Bihar", true, LocalDate.of(1992, 02, 15)));
        accountMap.put("AC002", new SavingAccount("AC002", "Sohan", 12, "Muz", 20000, "Bihar", true, LocalDate.of(1994, 03, 14)));
        accountMap.put("AC003", new SavingAccount("AC003", "Ram", 14, "Muz", 5000, "Bihar", true, LocalDate.of(1996, 05, 12)));
        accountMap.put("AC004", new SavingAccount("AC004", "Sita", 16, "Mumbai", 7000, "Maha", false, LocalDate.of(1998, 07, 10)));
        accountMap.put("AC005", new SavingAccount("AC005", "Raja", 18, "Pune", 11000, "Bihar", true, LocalDate.of(1999, 10, 6)));
        accountMap.put("AC006", new SavingAccount("AC006", "Gita", 21, "Delhi", 18000, "Delhi", false, LocalDate.of(2000, 04, 5)));

        return list;
    }
}
