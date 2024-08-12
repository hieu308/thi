package thi.service;

import thi.model.AccountSaving;

import java.util.List;

public interface IAccountSaveService {
    List<AccountSaving> getAll();
    void deleted (int id);
    void search(int id);
    boolean checkId (int id);
    void addAccountSave (AccountSaving accountSaving);
    void listToString(List<AccountSaving> list);
}
