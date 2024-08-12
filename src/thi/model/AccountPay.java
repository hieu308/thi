package thi.model;

import java.time.LocalDate;

public class AccountPay extends AccountBank {
 private  String carNumber;
 double aDouble;

    public AccountPay(int id, String codeBank, String nameOwner, LocalDate date, String carNumber, double aDouble) {
        super(id, codeBank, nameOwner, date);
        this.carNumber = carNumber;
        this.aDouble = aDouble;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public static AccountPay getAccountPay(String str){
    String[] parts = str.split(",");
    int id = Integer.parseInt(parts[0]);
    String codeBank = parts[1];
    String name = parts[2];
    LocalDate date = LocalDate.parse(parts[3]);
   String carNumber = parts[4];
    double aDouble = Double.parseDouble(parts[5]);
    return new AccountPay(id, codeBank, name, date, carNumber, aDouble);
}

    @Override
    public String toString() {
        return super.getId()+","+super.getCodeBank()+","+super.getNameOwner()+","+super.getDate()+","+getCarNumber()+","+getaDouble();
    }
}
