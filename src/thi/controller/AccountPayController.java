package thi.controller;

import thi.model.AccountPay;
import thi.service.AccountPayService;
import thi.service.IAccountPayService;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AccountPayController {
    IAccountPayService accountPayService = new AccountPayService();
    Scanner scanner = new Scanner(System.in);

    public void displayAccountPay() {
        List<AccountPay> payList = accountPayService.getAll();
        if (payList.size() > 0) {
            for (AccountPay accountPay : payList) {
                System.out.println(accountPay);

            }
        } else {
            System.out.println("Không tìm thấy id");
        }
    }

 public   void addAccountPay() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã bank");
        String bank = scanner.nextLine();
        System.out.println("Nhap tên");
        String nameOwner = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhap số thẻ");
        String number = scanner.nextLine();
        System.out.println("Nhập số tiền trong tài khoảng");
        int blance = Integer.parseInt(scanner.nextLine());
        AccountPay accountPay = new AccountPay(id, bank, nameOwner, date, number, blance);
        accountPayService.addAccountPay(accountPay);
     System.out.println("Thêm thành công");

    }

   public void searchAccountPay() {

        System.out.println("Nhâp id account pay:");
        int id = Integer.parseInt(scanner.nextLine());
        accountPayService.search(id);

    }

   public void deleteAccountPay() {
        System.out.println("Nhập id account pay cần xoá:");
        int id = Integer.parseInt(scanner.nextLine());
        accountPayService.deleted(id);
       System.out.println("Xoá thành công");
    }
}
