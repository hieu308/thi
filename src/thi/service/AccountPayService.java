package thi.service;

import thi.model.AccountPay;
import thi.repository.AccountPayRepo;
import thi.repository.IAcountPayRepo;

import java.util.List;

public class AccountPayService implements IAccountPayService {
    IAcountPayRepo accountPayRepo = new AccountPayRepo();


    @Override
    public List<AccountPay> getAll() {
        return accountPayRepo.getAll();
    }

    @Override
    public void deleted(int id) {
        accountPayRepo.deleted(id);
    }

    @Override
    public void search(int id) {
        accountPayRepo.search(id);
    }

    @Override
    public boolean checkId(int id) {
        return accountPayRepo.checkId(id);
    }

    @Override
    public void addAccountPay(AccountPay accountPay) {
       accountPayRepo.addAccountPay(accountPay);

    }

    @Override
    public void listToString(List<AccountPay> list) {
        accountPayRepo.listToString(list);
    }
}
