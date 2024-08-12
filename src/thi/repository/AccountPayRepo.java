package thi.repository;

import thi.model.AccountPay;
import thi.read_write.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class AccountPayRepo implements IAcountPayRepo {
    public static final String FILE_PAY = "D:\\thi\\thi\\src\\thi\\data\\pay.csv";

    public AccountPayRepo() {
        super();
    }

    @Override
    public List<AccountPay> getAll() {
        List<String> stringList = ReadAndWrite.readFileCSV(FILE_PAY);
        List<AccountPay> payList = new ArrayList<>();
        for (String string : stringList) {
            AccountPay accountPay = AccountPay.getAccountPay(string);
            payList.add(accountPay);
        }
        return payList;
    }

    @Override
    public void deleted(int id) {
        List<AccountPay> payList = getAll();
        for (int i = 0; i < payList.size(); i++) {
            if (payList.get(i).getId() == id) {
                payList.remove(i);
            }
        }
        listToString(payList);
    }

    @Override
    public void listToString(List<AccountPay> list) {
        List<String> stringList = new ArrayList<>();
        for (AccountPay accountPay : list) {
            stringList.add(accountPay.toString());
        }
        ReadAndWrite.writeFileCSV(FILE_PAY, stringList, false);
    }

    @Override
    public void search(int id) {
        List<AccountPay> payList = getAll();
        boolean found = false;
      for (AccountPay accountPay : payList) {
          if (accountPay.getId() == id) {
              found = true;
              System.out.println(accountPay.toString());
          }
      }
        if (!found) {
            System.out.println("Không tìm thấy ");
        }
    }

    @Override
    public boolean checkId(int id) {
        List<AccountPay> payList = getAll();
        for (AccountPay accountPay : payList) {
            if (accountPay.getId() == id) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void addAccountPay(AccountPay accountPay) {
        List<String> stringList = new ArrayList<>();
        String payStringString = accountPay.toString();
        stringList.add(payStringString);
        ReadAndWrite.writeFileCSV(FILE_PAY, stringList, true);
    }
}




