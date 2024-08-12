package thi.repository;

import thi.model.AccountPay;
import thi.model.AccountSaving;
import thi.read_write.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class AccountSavingRepo implements IAccountSavingRepo{
    public static final String FILE_SAVE = "D:\\thi\\thi\\src\\thi\\data\\saving.csv";



    @Override
    public List<AccountSaving> getAll() {
        List<String> stringList = ReadAndWrite.readFileCSV(FILE_SAVE);
        List<AccountSaving> payList = new ArrayList<>();
        for (String string : stringList) {
                AccountSaving accountSaving = AccountSaving.getAccountSave(string);
            payList.add(accountSaving);
        }
        return payList;
    }

    @Override
    public void deleted(int id) {
        List<AccountSaving> savingList = getAll();
        for (int i = 0; i < savingList.size(); i++) {
            if (savingList.get(i).getId() == id) {
               savingList.remove(i);
            }
        }
        listToString(savingList);
    }

    @Override
    public void search(int id) {
        List<AccountSaving> payList = getAll();
        boolean found = false;
        for (AccountSaving accountSaving : payList) {
            if (accountSaving.getId() == id) {
                found = true;
                System.out.println(accountSaving.toString());
            }
        }
        if (!found) {
            System.out.println("Truck not found");
        }
    }

    @Override
    public boolean checkId(int id) {
        List<AccountSaving> payList = getAll();
        for (AccountSaving accountSavingy : payList) {
            if (accountSavingy.getId() == id) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void addAccountSave(AccountSaving accountSaving) {
        List<String> stringList = new ArrayList<>();
        String payStringString = accountSaving.toString();
        stringList.add(payStringString);
        ReadAndWrite.writeFileCSV(FILE_SAVE, stringList, true);
    }

    @Override
    public void listToString(List<AccountSaving> list) {
        List<String> stringList = new ArrayList<>();
        for (AccountSaving accountSaving : list) {
            stringList.add(accountSaving.toString());
        }
        ReadAndWrite.writeFileCSV(FILE_SAVE, stringList, false);
    }
}
