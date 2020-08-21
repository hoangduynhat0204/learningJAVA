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
public interface AccountService {
    void tranferMoney(long fromAccountId, long toAccountId, double amount);
    void depositMoney(long accountId, double amount) throws Exception;
    Account getAccount(long accountId);
}
