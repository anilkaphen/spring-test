package com.anupam.springtest;

import com.anupam.springtest.modal.SavingAccount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest {
    public static void main(String[] args) {
        List<Integer> list = getInts();
        Collections.sort(list);
        System.out.println(list);

        List<String> names = getNames();
        Collections.sort(names);
        System.out.println(names);

        List<SavingAccount> saveAccounts = getAccounts();
        //1. Anonymous class
        Collections.sort(saveAccounts, new Comparator<SavingAccount>() {
            @Override
            public int compare(SavingAccount o1, SavingAccount o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        //2. Sort using method
        Collections.sort(saveAccounts, sortBySalary());

        //3. java 8 lamda expression
        Collections.sort(saveAccounts, (o1, o2)->o1.getAge()-o2.getAge());
        System.out.println(saveAccounts);

        //4. java 8 stream sorting
        System.out.println(saveAccounts.stream().sorted((o1, o2)->o1.getAge()-o2.getAge()).toList());

        System.out.println(saveAccounts.stream().sorted((o1, o2)->Integer.compare(o1.getAge(), o2.getAge())).toList());

        System.out.println(saveAccounts.stream().sorted((o1, o2)->Integer.compare(o1.getAge(), o2.getAge())).toList());
    }

    public static List<String> getNames(){
        List<String> list = new ArrayList<>();
        list.add("Pankaj");
        list.add("Niraj");
        list.add("Anupam");
        list.add("Anil");
        list.add("Tanu");
        list.add("Naman");
        return list;
    }

    public static List<Integer> getInts(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(2);
        list.add(8);
        list.add(9);

        return  list;
    }

    public static List<SavingAccount> getAccounts() {
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

    public static Comparator<SavingAccount> sortBySalary() {
        return new Comparator<SavingAccount>() {
            @Override
            public int compare(SavingAccount o1, SavingAccount o2) {
                if(o1.getBalance()<o2.getBalance()) {
                    return -1;
                }
                else if(o1.getBalance()>o2.getBalance()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        };
    }
}
