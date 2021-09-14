package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
     List<Account> result = new ArrayList<>();
     users.putIfAbsent(user, result);
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> list = users.get(user);
        list.add(account);
        users.putIfAbsent(user, list);
    }



    public User findByPassport(String passport) {
        User detected = null;
        for (User index: users.keySet()) {
             if(index.getPassport().equals(passport)) {
              detected = index;
              break;
             }
        }
        return detected;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account resul = null;
        User user = findByPassport(passport);
        List<Account> one = users.get(user);
        for (Account account: one) {
            if(account.getRequisite().equals(requisite)) {
                resul = account;
                break;
            }
        }
        return resul;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        User src = findByPassport(srcPassport);
        Account account = findByRequisite(srcPassport, srcRequisite);

        return rsl;
    }
}