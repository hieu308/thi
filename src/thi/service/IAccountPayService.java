package thi.service;

import thi.model.AccountPay;

import java.util.List;

public interface IAccountPayService {
    List<AccountPay> getAll();
    void deleted (int id);
    void search(int id);
    boolean checkId (int id);
    void addAccountPay (AccountPay accountPay);
    void listToString(List<AccountPay> list);
}
