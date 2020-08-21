/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness;

import beans.Account;

/**
 *
 * @author Hoang Duy Nhat
 */
public interface AccountRepository {
    void insert(Account account);
    void update(Account account);
    Account find(long accountId);
}
