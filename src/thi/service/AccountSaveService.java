package thi.service;

import thi.model.AccountSaving;
import thi.repository.AccountSavingRepo;
import thi.repository.IAccountSavingRepo;

import javax.naming.NamingEnumeration;
import java.util.List;

public class AccountSaveService implements IAccountSaveService {
    IAccountSavingRepo accountSavingRepo = new AccountSavingRepo();

    @Override
    public List<AccountSaving> getAll() {
        return accountSavingRepo.getAll();
    }

    @Override
    public void deleted(int id) {
        accountSavingRepo.deleted(id);
    }

    @Override
    public void search(int id) {
        accountSavingRepo.search(id);
    }

    @Override
    public boolean checkId(int id) {
        return accountSavingRepo.checkId(id);
    }

    @Override
    public void addAccountSave(AccountSaving accountSaving) {
        accountSavingRepo.addAccountSave(accountSaving);
    }

    @Override
    public void listToString(List<AccountSaving> list) {
        accountSavingRepo.listToString(list);
    }
}
