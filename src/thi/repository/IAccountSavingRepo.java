package thi.repository;

import thi.model.AccountPay;
import thi.model.AccountSaving;

import java.util.List;

public interface IAccountSavingRepo {
    List<AccountSaving> getAll();
    void deleted (int id);
    void search(int id);
    boolean checkId (int id);
    void addAccountSave (AccountSaving accountSaving);
    void listToString(List<AccountSaving> list);
}
