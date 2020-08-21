/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyen.service;

import com.nguyen.account.Account;
import com.nguyen.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author XV
 */
public class AccountServiceImpl implements AccountService{

    AccountRepository accountRepository;

    public AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    
    @Override
    public Account getAccount (int account) {
        return this.accountRepository.get(account);
    }
    
    @Override
    public void transfer(int fromAccountId, int toAccountId, double amount) {
        
        Account accFrom = getAccount(fromAccountId);
        accFrom.setBabance(accFrom.getBabance() - amount);
        Account accTo = getAccount(toAccountId);
        accTo.setBabance(accTo.getBabance() + amount);
        
        accountRepository.update(accFrom);
        accountRepository.update(accTo);
    }
    
}
