package thi.repository;

import thi.model.AccountPay;

import java.util.List;

public interface IAcountPayRepo {
    List<AccountPay> getAll();
    void deleted (int id);
    void search(int id);
    boolean checkId (int id);
    void addAccountPay (AccountPay accountPay);
    void listToString(List<AccountPay> list);
}
