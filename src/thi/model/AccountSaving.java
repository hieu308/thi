package thi.model;

import java.time.LocalDate;

public class AccountSaving extends AccountBank {
    private int balance;
    LocalDate daySend;
    int interestRate;
    int temp;

    public AccountSaving(int id, String codeBank, String nameOwner, LocalDate date, int balance, LocalDate daySend, int interestRate, int temp) {
        super(id, codeBank, nameOwner, date);
        this.balance = balance;
        this.daySend = daySend;
        this.interestRate = interestRate;
        this.temp = temp;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public LocalDate getDaySend() {
        return daySend;
    }

    public void setDaySend(LocalDate daySend) {
        this.daySend = daySend;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    public static AccountSaving getAccountSave(String str) {
        String[] parts = str.split(",");
        int id = Integer.parseInt(parts[0]);
        String codeBank = parts[1];
        String name = parts[2];
        LocalDate date = LocalDate.parse(parts[3]);
        int balance = Integer.parseInt(parts[4]);
        LocalDate daySend = LocalDate.parse(parts[5]);
        int interestRate = Integer.parseInt(parts[6]);
        int temp = Integer.parseInt(parts[7]);
        return new AccountSaving(id, codeBank, name, date, balance, daySend, interestRate, temp);

    }

    @Override
    public String toString() {
         return super.getId()+","+super.getCodeBank()+","+super.getNameOwner()+","+super.getDate()+","+getBalance()+","+getInterestRate()+","+getTemp();
    }
}
