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
        List<SavingAccount> AccountByMonth = accountTest.getAccountByMonth("January");
        System.out.println("getAccountByMonth: \n" + AccountByMonth);

        List<SavingAccount> EmployeByDobAndState = accountTest.getEmployeByDobAndState();
        System.out.println("getEmployeByDobAndState =: \n" + EmployeByDobAndState);

        List<SavingAccount> AccountByStateAndCity = accountTest.getEmployeeByStateAndCity("Bihar", "Muz");
        System.out.println("AccountByStateAndCity: \n" + AccountByStateAndCity);

        long AccountAverageBalance = accountTest.getAccountAverageBalance();
        System.out.println(" getAccountAverageBalance\n: " + AccountAverageBalance);
        List<SavingAccount> WomenAccountOfBihar = accountTest.getWomenAccountOfBihar();

        System.out.println(" getWomenAccountOfBihar\n: " + WomenAccountOfBihar);

        //System.out.println(" getAccountByGender\n: " + accountTest.getAccountByGender(false));
        long maxSalayBihar = accountTest.getMaxSalBihar();
        System.out.println("getMaxSalBihar\n:" + maxSalayBihar);

    }

    public List<SavingAccount> saveAccounts() {
        List<SavingAccount> list = new ArrayList<>();

        list.add(new SavingAccount("AC001", "Mohan", 10, "Patna", 10000, "Bihar", true, LocalDate.of(1948, 02, 15)));
        list.add(new SavingAccount("AC002", "Sohan", 12, "Muz", 20000, "Bihar", true, LocalDate.of(1994, 03, 14)));
        list.add(new SavingAccount("AC003", "Ram", 14, "Muz", 5000, "Bihar", true, LocalDate.of(1996, 05, 12)));
        list.add(new SavingAccount("AC004", "Sita", 16, "Mumbai", 7000, "Maha", false, LocalDate.of(1998, 07, 10)));
        list.add(new SavingAccount("AC005", "Raja", 18, "Pune", 11000, "Bihar", true, LocalDate.of(1999, 10, 6)));
        list.add(new SavingAccount("AC006", "Gita", 21, "Delhi", 18000, "Delhi", false, LocalDate.of(2000, 04, 5)));
        list.add(new SavingAccount("AC006", "Rita", 25, "Darbhangha", 19000, "Bihar", false, LocalDate.of(2001, 06, 9)));

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
            if (s.isGender() == (gender)) {
                list.add(s);
            }
        }
        return list;
    }

    public List<SavingAccount> getAccountByYear(int year) {
        List<SavingAccount> list = new ArrayList<>();
        for (SavingAccount s : accountDetails) {
            if (s.getDob().getYear() > (year)) {
                list.add(s);
            }
        }
        return list;
    }

    public List<SavingAccount> getAccountByState(String state) {
        List<SavingAccount> list = new ArrayList<>();
        for (SavingAccount s : accountDetails) {
            if (s.getState().equals(state)) {
                list.add(s);
            }
        }
        return list;
    }

    public List<SavingAccount> getEmployeByDobAndState() {
        List<SavingAccount> list = new ArrayList<>();
        for (SavingAccount s : accountDetails) {
            if (s.getState().equals("Bihar") && s.getDob().isAfter(LocalDate.of(1950, 04, 5))) {
                list.add(s);
            }
        }
        return list;
    }

    public List<SavingAccount> getEmployeeByStateAndCity(String state, String city) {
        List<SavingAccount> list = new ArrayList<>();
        for (SavingAccount s : accountDetails) {
            if (s.getState().equals(state) && s.getCity().equals(city)) ;
            list.add(s);
        }
        return list;
    }


    public long getMinSalMaharashtra(List<SavingAccount> savingAccounts) {
        long lowest = 9999;
        for (SavingAccount s : accountDetails) {
            if (lowest < s.getBalance()) {
                lowest = s.getBalance();
            }

        }
        return lowest;

    }

    public long getMaxSalBihar() {
        List<SavingAccount> list = getAccountByState("Bihar");
        long maximum = -1;
        for (SavingAccount s : list) {
            if (maximum > s.getBalance()) {
                maximum = s.getBalance();
            }
        }
        return maximum;

    }

    public List<SavingAccount> getWomenAccountOfBihar() {
        List<SavingAccount> list = new ArrayList<>();
        for (SavingAccount s : accountDetails) {
            if (s.isGender() == false && s.getState().equals("Bihar"))
                list.add(s);

        }


        return list;
    }

    public List<SavingAccount> getAccountByMonth(String month) {
        List<SavingAccount> list = new ArrayList<>();
        for (SavingAccount s : accountDetails) {
            if (month.equals(s.getDob().getMonth())) {
                list.add(s);

                if (s.getDob().getMonth().equals(month)) {
                    list.add(s);
                }
            }
        }
        return list;
    }
}


