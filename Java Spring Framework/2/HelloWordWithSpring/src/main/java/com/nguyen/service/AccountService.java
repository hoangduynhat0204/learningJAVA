/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyen.service;

import com.nguyen.account.Account;

/**
 *
 * @author XV
 */
public interface AccountService {
    void transfer(int fromAccountId, int toAccountId, double amount);
    Account getAccount (int account);
}
