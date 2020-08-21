/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyen.dao;

import com.nguyen.account.Account;

/**
 *
 * @author XV
 */
public interface AccountRepository {
    void insert (Account account);
    void update (Account account);
    Account get(int id);
}
