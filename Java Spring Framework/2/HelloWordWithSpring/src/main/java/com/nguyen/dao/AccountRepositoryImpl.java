/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyen.dao;

import com.nguyen.account.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XV
 */
public class AccountRepositoryImpl implements AccountRepository{

    private static List<Account> datas;
    
    public AccountRepositoryImpl(){
        datas = new ArrayList();
        Account acc1 = new Account();
        acc1.setId(0);
        acc1.setBabance(50);
        acc1.setOwnerName("Vo Thi Nhat Cong");
        datas.add(acc1);
        
        Account acc2 = new Account();
        acc2.setId(1);
        acc2.setBabance(50);
        acc2.setOwnerName("Dang Cao Nguyen");
        datas.add(acc2);
    }
    
    @Override
    public void insert(Account account) {
        datas.add(account);
    }

    @Override
    public void update(Account account) {
        for (Account data : datas) {
            if (data.getId() == account.getId()) {
                data.setBabance(account.getBabance());
                break;
            }
        }
    }

    @Override
    public Account get(int id) {
        for (Account data : datas) {
            if (data.getId() == id) {
                return data;
            }
        }
        return null;
    }
    
}
